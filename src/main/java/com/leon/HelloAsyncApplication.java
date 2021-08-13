package com.leon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@Slf4j
@EnableAsync // 开启异步
@SpringBootApplication
public class HelloAsyncApplication {
    public static void main(String[] args) {
        log.error("com.leon.HelloAsyncApplication.main 的线程为 {}", Thread.currentThread().getName());
        SpringApplication.run(HelloAsyncApplication.class, args);
    }

}
