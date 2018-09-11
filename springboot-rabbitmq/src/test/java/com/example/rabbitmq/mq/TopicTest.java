package com.example.rabbitmq.mq;

import com.example.rabbitmq.RabbitmqApplication;
import com.example.rabbitmq.mq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqApplication.class)
public class TopicTest {
    @Autowired
    private TopicSender topicSender;

    @Test
    public void Test() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        topicSender.topicSender("time => " + sf.format(new Date()));
    }
}
