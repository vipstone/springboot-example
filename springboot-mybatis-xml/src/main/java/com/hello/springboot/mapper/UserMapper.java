package com.hello.springboot.mapper;

import com.hello.springboot.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> findAll();

    User findById(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
