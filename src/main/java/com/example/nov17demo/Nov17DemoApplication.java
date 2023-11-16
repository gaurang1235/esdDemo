package com.example.nov17demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
public class Nov17DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Nov17DemoApplication.class, args);
    }

}