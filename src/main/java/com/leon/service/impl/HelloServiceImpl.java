package com.leon.service.impl;

import com.leon.async.AsyncDemo;
import com.leon.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @PROJECT_NAME: hello-async
 * @CLASS_NAME: HelloServiceImpl
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/8/13 17:22
 * @Version 1.0
 * @DESCRIPTION:
 **/
@Slf4j
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    private AsyncDemo asyncDemo;

    @Async
    @Override
    public void hello() {
        log.error("service 异步执行的线程为 {}", Thread.currentThread().getName());
        asyncDemo.asyncDemo();
    }
}
