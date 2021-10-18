package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2021-10-18 10:22
 */
@Controller
public class TestController {

    @RequestMapping("/**/testInterceptor")
    public String testInterceptor() {
        System.out.println("testInterceptor");
        return "success";
    }

    @RequestMapping("/testExceptionHandler")
    public String testExceptionHandler(){
        System.out.println(1/0);
        return "success";
    }
}
