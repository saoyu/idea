package com.shaoyu;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/14
 */
@Component
public class Receiver {
    /**
     * 接收消息的方法。采用消息队列监听机制
     * @param msg
     */
    @RabbitListener(queues="hello-queue")
    public void process(String msg){
        System.out.println("receiver:"+msg);
    }
}
