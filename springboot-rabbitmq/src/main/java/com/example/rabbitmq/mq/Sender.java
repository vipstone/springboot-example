package com.example.rabbitmq.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息发送者-生产消息
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void driectSend(String message) {
        System.out.println("Direct 发送消息：" + message);
        //参数一：交换器名称，可以省略（省略存储到AMQP default交换器）；参数二：路由键名称（direct模式下路由键=队列名称）；参数三：存储消息
        this.rabbitTemplate.convertAndSend("direct", message);
    }

}
