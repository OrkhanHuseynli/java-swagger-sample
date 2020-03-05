package com.sample.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwaggerApp {
    public static void main(String[] args){
        System.out.println("Running app");
        SpringApplication.run(SwaggerApp.class, args);
    }
}
