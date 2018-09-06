package com.hello.springboot.web;

import com.hello.springboot.domain.User;
import com.hello.springboot.service.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.nio.channels.AsynchronousByteChannel;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

@Test
@Transactional
public void saveTest() {
    User user = new User();
    user.setName("Adam");
    user.setAge(19);
    user.setPwd("123456");
    userRepository.save(user);
    System.out.println("userId:" + user.getId());
    Assert.assertTrue(user.getId()>0);
}
}