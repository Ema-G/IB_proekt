package com.example.bp_proekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.example.bp_proekt.model")
@EnableJpaRepositories("com.example.bp_proekt.repository")
@SpringBootApplication
@ComponentScan(basePackages = { "com.example.bp_proekt","com.example.bp_proekt.web" })
public class BpProektApplication {

    public static void main(String[] args) {
        SpringApplication.run(BpProektApplication.class, args);
    }

}
