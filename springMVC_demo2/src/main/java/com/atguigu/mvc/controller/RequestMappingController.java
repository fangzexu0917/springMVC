package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create 2021-10-13 16:41
 */
@Controller
//@RequestMapping("/test")
public class RequestMappingController {
    @RequestMapping(value = {"/testsuccesssrm", "/test"})
    public String success() {
        return "success";
    }
}
