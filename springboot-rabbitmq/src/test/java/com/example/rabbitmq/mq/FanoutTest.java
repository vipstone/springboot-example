package com.example.rabbitmq.mq;

import com.example.rabbitmq.RabbitmqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqApplication.class)
public class FanoutTest {
    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void Test() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        fanoutSender.send("Time1 => " + sf.format(new Date()));
        fanoutSender.send2("Date2 => " + sf.format(new Date()));
    }
}
