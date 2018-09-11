package com.example.rabbitmq.controller;

import com.example.rabbitmq.mq.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/")
@RestController
public class MqController {

    @Autowired
    private FanoutSender fanoutSender;

    @RequestMapping("/s")
    public void send() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        fanoutSender.send("Time1 => " + sf.format(new Date()));
        fanoutSender.send2("Date2 => " + sf.format(new Date()));
    }
}
