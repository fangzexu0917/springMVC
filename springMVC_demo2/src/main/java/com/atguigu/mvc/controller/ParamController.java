package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

import com.atguigu.mvc.bean.User;

/**
 * @author shkstart
 * @create 2021-10-14 10:58
 */
@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest requset) {
        String username = requset.getParameter("username");
        String password = requset.getParameter("password");
        System.out.println("username:" + username + " password:" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name", required = false, defaultValue = "hehe") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "sayHaha", required = false, defaultValue = "haha") String host,
            @CookieValue("SESSION") String cookieId
    ) {
        System.out.println("username:" + username + " password:" + password + " hobby:" + Arrays.toString(hobby));
        System.out.println("Host:" + host);
        System.out.println("cookieId:" + cookieId);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user) {
        System.out.println("user:" + user);
        return "success";

    }

}
