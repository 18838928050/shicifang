package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import util.IdWorker;

@SpringBootApplication
public class BaseAplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseAplication.class,args);
    }
    @Bean
    public IdWorker idWorker()
    {
        return new IdWorker(1,1);
    }
}
