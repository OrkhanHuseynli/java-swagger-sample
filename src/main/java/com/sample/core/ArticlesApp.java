package com.sample.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArticlesApp {
    public static void main(String[] args){
        System.out.println("Running app");
        SpringApplication.run(ArticlesApp.class, args);
    }
}
