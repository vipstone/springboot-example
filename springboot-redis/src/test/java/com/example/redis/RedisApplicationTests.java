package com.example.redis;

import com.example.redis.entity.User;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private String _CacheKey = "testRedis";

    @Test
    public void contextLoads() {

        stringRedisTemplate.opsForValue().set(_CacheKey, String.valueOf(new Date().getTime()));
        Assert.assertNotNull(stringRedisTemplate.opsForValue().get(_CacheKey));
        Assert.assertTrue(true);

    }

    @Test
    public void testEq() {
        Assert.assertEquals(1, 1);
    }


    @Test
    public void testBool() {
        Assert.assertTrue(true);
    }

    @Test
    public void doTest() {
        String[] string1 = {"1", "2"};
        String[] string2 = string1;
        String[] string3 = {"1", "2"};

        Assert.assertEquals(string1, string2);
        Assert.assertEquals(string2, string3);
        Assert.assertSame(string1, string2);
        Assert.assertSame(string2, string3);
    }


}
