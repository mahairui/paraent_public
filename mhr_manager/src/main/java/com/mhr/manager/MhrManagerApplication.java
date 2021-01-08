package com.mhr.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mhr.mapper.*")
public class MhrManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MhrManagerApplication.class, args);
    }

}
