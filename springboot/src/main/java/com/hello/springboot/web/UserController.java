package com.hello.springboot.web;

import com.hello.springboot.dao.User;
import com.hello.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public ModelAndView index() {
        userRepository.save(new User("大明",19,"123456"));
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("dataSize", userRepository.findAll().size());
        return modelAndView;
    }



}
