package com.springcloud.eurekaclientapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClientApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApiApplication.class, args);
		//new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
	}

}
