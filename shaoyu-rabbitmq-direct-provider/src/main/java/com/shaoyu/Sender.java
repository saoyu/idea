package com.shaoyu;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/14
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    /**
     * 发消息
     */
    public void send(String msg){
        this.amqpTemplate.convertAndSend("hello-queue", msg);
    }
}
