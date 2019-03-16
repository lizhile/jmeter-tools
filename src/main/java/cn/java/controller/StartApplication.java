package cn.java.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "cn.java.controller" })
@EnableAutoConfiguration
public class StartApplication {
    public static void main(String[] args) {
    	SpringApplication.run(StartApplication.class, args);
    }
}
