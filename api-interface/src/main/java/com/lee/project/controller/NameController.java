package com.lee.project.controller;


import com.lee.project.model.User;
import com.lee.project.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 */
@RestController
@RequestMapping("name")
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
    public String getUserNameBypost(@RequestBody User user, HttpServletRequest request) {
        String accessKey = request.getHeader("accessKey");
        String nonce = request.getHeader("nonce");
        String timestamp = request.getHeader("timestamp");
        String sign = request.getHeader("sign");
        String body = request.getHeader("body");
        String serverSign = SignUtils.genSign(body, "yanjiusheng");
        //todo 实际从数据库中查询是否已经分配给用户
        if (!accessKey.equals("jiwenhao")){
            throw new RuntimeException("无权限");
        }
        if(Long.parseLong(nonce) > 10000){
            throw new RuntimeException("无权限");
        }
        //todo 时间戳不能超过5分钟
        if(!sign.equals(serverSign)){
            throw new RuntimeException("无权限");
        }
        return "POST用户名字是" + user.getUsername();
    }
}
