package com.rbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class PetstoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(PetstoreApplication.class, args);
    }
}
