package com.example.testjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TestJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestJobApplication.class, args);
    }

}
