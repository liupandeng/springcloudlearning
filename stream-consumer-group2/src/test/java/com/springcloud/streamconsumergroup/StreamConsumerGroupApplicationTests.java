package com.springcloud.streamconsumergroup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableBinding(StreamConsumerGroupApplicationTests.ExampleBinderSource.class)
public class StreamConsumerGroupApplicationTests {
	@Autowired
	private ExampleBinderSource exampleBinderSource;

	@Test
	public void contextLoads() {
	}

//	@Autowired
//	@Qualifier(value = "Example-topic")
//	private MessageChannel output;

	@Test
	public void exampleBinderTester(){
		exampleBinderSource.output().send(MessageBuilder.withPayload("Produce a message from : http://blog.didispace.com").build());
	}


	public interface ExampleBinderSource{

		String NAME="Example-topic" ;

		@Output(NAME)
		MessageChannel output();
	}


}
