package com.spring.config.ConfigPropertiesDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigPropertiesDemoApplication implements CommandLineRunner {

    @Autowired
    DemoConfiguration demoConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ConfigPropertiesDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(demoConfiguration);
    }
}
