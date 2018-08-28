package com.hello.springboot.web;

import com.hello.springboot.dao.ArticleMapper;
import com.hello.springboot.entity.Article;
import com.hello.springboot.entity.User;
import com.hello.springboot.dao.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/art")
public class ArticleController {

    @Resource
    private ArticleMapper articleMapper;

    @RequestMapping("/")
    public void index() {
        Article article = new Article();
        article.setUid(new Long(1));
        article.setCtime(new Date().getTime());
        article.setTitle("Adam");
        article.setContent("i am Adam.");
        articleMapper.insert(article);
    }

}
