package com.zywl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@Configuration
@EnableScheduling
@MapperScan(basePackages = "com.zywl.dao")
public class TestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
