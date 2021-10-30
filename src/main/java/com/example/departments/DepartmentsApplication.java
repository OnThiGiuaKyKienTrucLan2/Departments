package com.example.departments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentsApplication.class, args);
    }

}
