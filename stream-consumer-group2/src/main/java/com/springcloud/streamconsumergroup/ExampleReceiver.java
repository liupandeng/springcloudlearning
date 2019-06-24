package com.springcloud.streamconsumergroup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding(ExampleReceiver.ExampleBinder.class)
public class ExampleReceiver {

    public static Logger logger = LoggerFactory.getLogger(ExampleReceiver.class);

    @StreamListener(ExampleBinder.NAME)
    public void receive(Object payload){
        logger.info(" ExampleReceiver Received :" + payload);
    }


    public interface ExampleBinder{

        String  NAME = "Example-topic";

        @Input(NAME)
        SubscribableChannel input();

    }


}
