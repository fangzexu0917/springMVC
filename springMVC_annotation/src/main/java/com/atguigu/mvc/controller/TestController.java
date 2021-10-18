package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2021-10-18 15:07
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String test(){
        return "index";
    }

}
