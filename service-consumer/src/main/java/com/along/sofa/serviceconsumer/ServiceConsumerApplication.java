package com.along.sofa.serviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.along.sofa.HelloSyncService;

@ImportResource({"classpath*:service-consumer.xml"})
@SpringBootApplication
public class ServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ServiceConsumerApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);

		HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
				.getBean("helloSyncServiceReference");

		System.out.println(helloSyncServiceReference.saySync("consumer"));
	}
}
