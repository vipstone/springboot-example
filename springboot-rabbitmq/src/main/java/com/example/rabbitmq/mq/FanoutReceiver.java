package com.example.rabbitmq.mq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
@RabbitListener(queues = "fanout")
public class FanoutReceiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("Fanout（FanoutReceiver）消费消息：" + msg);
    }
}
