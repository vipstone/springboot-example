package com.example.rabbitmq.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(String message) {
        System.out.println("发送消息：" + message);
        this.rabbitTemplate.convertAndSend(FanoutConfig.EXCHANGE_NAME,FanoutConfig.QUEUE_NAME, message);
    }
    public void send2(String message) {
        System.out.println("发送消息2：" + message);
        this.rabbitTemplate.convertAndSend(FanoutConfig.EXCHANGE_NAME,FanoutConfig.QUEUE_NAME2, message);
    }
}
