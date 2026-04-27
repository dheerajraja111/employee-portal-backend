package com.example.employeeprofilesvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.employeeportal")
@EnableJpaRepositories(basePackages = "com.employeeportal")
@EntityScan(basePackages = "com.employeeportal")
public class EmployeeProfileSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeProfileSvcApplication.class, args);
    }

}
