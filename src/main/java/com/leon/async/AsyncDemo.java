package com.leon.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @PROJECT_NAME: hello-async
 * @CLASS_NAME: AsyncDemo
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/8/13 17:20
 * @Version 1.0
 * @DESCRIPTION:
 **/
@Slf4j
@Component
public class AsyncDemo {

    /**
     * 测试异步方法
     */
    @Async
    public void asyncDemo() {
        log.error("com.leon.async.AsyncDemo.asyncDemo 的线程为 {}", Thread.currentThread().getName());
    }
}
