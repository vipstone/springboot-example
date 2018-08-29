package com.hello.springboot.web;

import com.hello.springboot.dao.IndexBuilderDao;
import com.hello.springboot.dao.UserDao;
import com.hello.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private IndexBuilderDao indexBuilderDao;

    @RequestMapping("/")
    public ModelAndView index() {
        User user = new User();
        user.setId(indexBuilderDao.getNextSequence("user"));
        user.setAge(18);
        user.setName("Adam");
        user.setPwd("123456");
        userDao.insert(user);

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("count", userDao.findAll().size());
        return modelAndView;
    }

}
