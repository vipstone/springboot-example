package com.hello.springboot.service;

import com.hello.springboot.entity.User;
import com.hello.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取所有用户信息
     * @return
     */
    public List<User> getAll() {
        return userMapper.getAll();
    }

    /**
     * 添加用户
     * @param user
     */
    public void insert(User user){
        userMapper.install(user);
    }

}
