package com.example.swagger.com.example.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.logging.Logger;

import static springfox.documentation.builders.PathSelectors.regex;

@RestController
@RequestMapping("/api/user")
@Api(tags = "用户控制器")
public class UserController {

    @ApiOperation(value = "打招呼", notes = "测试方法")
    @RequestMapping(value = "/sayhi", method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "姓名", required = true, paramType = "form"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true, paramType = "form"),
    })
    public String sayHi(String name, int age) {
        return "Hello," + name;
    }

    @ApiOperation(value = "获取所有用户", notes = "查询分页数据")
    @RequestMapping(value = "/getall", method = RequestMethod.POST)
    public String getAll() {
        return "所有用户";
    }
}
