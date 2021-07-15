package com.yuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.yuan.*"})
@SpringBootApplication
public class SpringbootRestfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestfulcrudApplication.class, args);
    }

}
