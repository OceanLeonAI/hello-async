package com.leon.listener;

import com.google.common.base.Throwables;
import com.leon.async.AsyncDemo;
import com.leon.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @PROJECT_NAME: hello-async
 * @CLASS_NAME: HelloListener
 * @AUTHOR: OceanLeonAI
 * @CREATED_DATE: 2021/8/13 17:25
 * @Version 1.0
 * @DESCRIPTION:
 **/
@Slf4j
@Component
public class HelloListener {

    @Autowired
    private HelloService helloService;

    @Autowired
    private AsyncDemo asyncDemo;

    @EventListener
    public void start(final ContextRefreshedEvent event) {
        log.error("接收到事件 {},当前线程为 {}", event.getSource(), Thread.currentThread().getName());
        try {
            log.error("开始异步调用 {}", System.currentTimeMillis());
            helloService.hello();
            log.error("结束异步调用 {}", System.currentTimeMillis());
            asyncDemo.asyncDemo();
        } catch (final Exception e) {
            log.error("Unable to initialize services due to {}", e.getMessage(), e);
            Throwables.propagate(e);
        }
        log.info("Finished starting internal services.");
    }
}
