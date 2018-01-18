package br.com.springtests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AppStart {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(AppStart.class, args);
    }
}