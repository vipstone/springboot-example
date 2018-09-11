package com.example.rabbitmq.mq.topic;

import com.example.rabbitmq.mq.FanoutConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void topicSender(String message) {
        String routingKey = "log.all.error";
        System.out.println(routingKey + " 发送消息：" + message);
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE_NAME, routingKey, message);
    }
}
