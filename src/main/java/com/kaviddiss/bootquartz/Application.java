package com.kaviddiss.bootquartz;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SchedulerConfig.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Spring-boot-quartz-demo start successful.");
    }
}
