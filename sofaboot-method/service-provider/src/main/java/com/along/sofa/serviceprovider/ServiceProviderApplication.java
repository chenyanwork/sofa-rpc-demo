package com.along.sofa.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.along.sofa.HelloSyncService;

@ImportResource({"classpath*:service-provider-spring.xml"})
@SpringBootApplication
public class ServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ServiceProviderApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);

        HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext
                .getBean("helloSyncServiceImpl");

        System.out.println(helloSyncServiceReference.saySync("sync"));
    }
}
