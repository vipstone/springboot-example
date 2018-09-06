package com.hello.springboot.web;

import com.hello.springboot.domain.User;
import com.hello.springboot.service.UserRepository;
import com.hello.springboot.service.UserService;
import com.sun.org.apache.regexp.internal.REUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public ModelAndView index() {
        int result = userRepository.modifyName("王磊的博客", new Long(1));
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("id", result);
        return modelAndView;
    }

    @RequestMapping("/save")
    public boolean save() {
        boolean result = false;
        User user = new User();
        user.setName("Adam");
        user.setAge(19);
        user.setCtime(new Date().getTime());
        user.setPwd("123456");
        userRepository.save(user);
        result = user.getId() > 0;
        System.out.println("userId:" + user.getId());
        return result;
    }


}
