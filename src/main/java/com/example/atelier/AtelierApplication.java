package com.example.atelier;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.example.atelier")
public class AtelierApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtelierApplication.class, args);
    }

}
