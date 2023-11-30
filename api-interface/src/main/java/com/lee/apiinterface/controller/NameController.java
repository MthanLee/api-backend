package com.lee.apiinterface.controller;

import com.lee.client.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * 名称 API
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameBypost(@RequestBody User user) {
        String result = "POST 用户名字是" + user.getUsername();
        return result;
    }
}
