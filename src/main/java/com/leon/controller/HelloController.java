package com.leon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PROJECT_NAME: hello-async
 * @CLASS_NAME: HelloController
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/8/13 17:16
 * @Version 1.0
 * @DESCRIPTION:
 **/
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        log.error("com.leon.controller.HelloController.hello 的线程为 {}", Thread.currentThread().getName());
        return "hello";
    }
}
