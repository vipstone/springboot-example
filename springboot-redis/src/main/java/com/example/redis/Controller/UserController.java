package com.example.redis.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    // 缓存key
    private final String _CacheKey = "userCacheKeyTime";

    @RequestMapping("/")
    @Cacheable(value = _CacheKey)
    public String doGet() {

//        stringRedisTemplate.hasKey(_CacheKey);
//        stringRedisTemplate.opsForValue().set(_CacheKey,"value");
//        stringRedisTemplate.opsForValue().get(_CacheKey);

        System.out.println("没有出现这行代码，说明缓存已经生效。");
        return "cache:" + new Date().getTime();
    }

    @RequestMapping("/put")
    @CachePut(value = _CacheKey)
    public String putCache() {
        System.out.println("缓存更新");
        return "update cache:" + new Date().getTime();
    }

    @RequestMapping("/del")
    @CacheEvict(value = _CacheKey)
    public String delCache() {
        System.out.println("缓存删除");
        return "delete cache:" + new Date().getTime();
    }

/**
 * 测试Session
 * @param session
 */
@RequestMapping("/uid")
public String testSession(HttpSession session) {
    UUID uid = (UUID) session.getAttribute("uid");
    System.out.println("uid:"+uid);
    if (uid == null) {
        uid = UUID.randomUUID();
    }
    session.setAttribute("uid", uid);
    String sessionId = session.getId();
    System.out.println("session:"+sessionId);
    return sessionId;
}


}
