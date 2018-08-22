package com.hello.springboot.web;

import com.hello.springboot.entity.User;
import com.hello.springboot.mapper.UserMapper;
import com.hello.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/")
    public ModelAndView index() {
        User user = new User();
        user.setAge(18);
        user.setName("Adam");
        user.setPwd("123456");
        userMapper.install(user);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("count", userMapper.getAll().size());
        return modelAndView;
    }
}
