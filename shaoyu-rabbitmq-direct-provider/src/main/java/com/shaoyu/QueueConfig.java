package com.shaoyu;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/14
 */
@Configuration
public class QueueConfig {
    /**
     * 创建队列
     * @return
     */
    @Bean
    public Queue createQueue(){
        return new Queue("hello-queue");
    }
}
