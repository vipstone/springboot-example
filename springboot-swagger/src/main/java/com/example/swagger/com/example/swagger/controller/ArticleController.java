package com.example.swagger.com.example.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@RestController
@RequestMapping("/art")
@Api(tags = "文章控制器")
public class ArticleController {

    @ApiOperation(value = "获取所有文章", notes = "查询分页数据")
    @RequestMapping(value = "/getall", method = RequestMethod.POST)
    public String getAll() {
        return "所有文章";
    }


    @ApiOperation(value = "获取单篇文章", notes = "获取单篇文章")
    @RequestMapping(value = "/getone", method = RequestMethod.GET)
    public String getOne() {
        return "单篇";
    }

}
