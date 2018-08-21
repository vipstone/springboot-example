package com.hello.springboot.web;

import com.hello.springboot.domain.User;
import com.hello.springboot.service.UserRepository;
import com.hello.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private  UserRepository userRepository;

    @RequestMapping("/")
    public ModelAndView index() {

        int result = userRepository.modifyName("王磊的博客",new Long(1));

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("id", result);
        return modelAndView;
    }


}
