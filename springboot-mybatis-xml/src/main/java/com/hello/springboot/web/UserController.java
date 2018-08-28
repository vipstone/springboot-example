package com.hello.springboot.web;

import com.hello.springboot.entity.User;
import com.hello.springboot.dao.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/")
    public ModelAndView index() {
        User user = new User();
        user.setAge(18);
        user.setName("Adam");
        user.setPwd("123456");
        userMapper.insert(user);

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("count", userMapper.findAll().size());
        return modelAndView;
    }

}
