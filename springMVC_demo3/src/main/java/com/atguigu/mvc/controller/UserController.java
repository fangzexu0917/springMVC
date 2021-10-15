package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shkstart
 * @create 2021-10-15 8:51
 */
@Controller
public class UserController {
    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /user    GET     查询所有用户信息
     * /user/1  GET     根据用户id查询用户信息
     * /user    POST    添加用户信息
     * /user/1  DELETE  删除用户信息
     * /user    PUT     修改用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUsers() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id) {
        System.out.println("根据id查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insertUser(@RequestParam(value = "username", required = true, defaultValue = "sb") String name,
                             @RequestParam(value = "password", required = true, defaultValue = "sb") String pwd
    ) {
        System.out.println("添加用户信息：" + name + ";" + pwd);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(@RequestParam(value = "username", required = true, defaultValue = "sb") String name,
                             @RequestParam(value = "password", required = true, defaultValue = "sb") String pwd
    ) {
        System.out.println("修改用户信息：" + name + ";" + pwd);
        return "success";
    }


}
