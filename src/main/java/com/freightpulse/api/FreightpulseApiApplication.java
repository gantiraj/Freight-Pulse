package com.freightpulse.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.freightpulse.api.repository")



@SpringBootApplication
public class FreightpulseApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(FreightpulseApiApplication.class, args);
    }
}
