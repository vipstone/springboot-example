package com.example.redis.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class UserController {

    // 缓存key
    private final String _CacheKey = "userCacheKeyTime";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/")
    @Cacheable(value = _CacheKey)
    public String doGet() {
//        stringRedisTemplate.opsForValue().set(_CacheKey, String.valueOf(new Date().getTime())); //redis存值
//        return stringRedisTemplate.opsForValue().get(_CacheKey); //redis取值
        System.out.println("没有出现这行代码，说明缓存已经生效。");
        return "设置缓存：" + new Date().getTime();
    }

    @RequestMapping("/put")
    @CachePut(value = _CacheKey)
    public String putCache() {
        System.out.println("缓存更新");
        return "缓存更新:" + new Date().getTime();
    }

    @RequestMapping("/del")
    @CacheEvict(value = _CacheKey)
    public String delCache() {
        System.out.println("缓存删除");
        return "缓存删除:" + new Date().getTime();
    }


}
