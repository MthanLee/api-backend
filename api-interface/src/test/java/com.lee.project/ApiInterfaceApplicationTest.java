package com.lee.project;


import com.lee.project.client.ApiClient;
import com.lee.project.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ApiInterfaceApplicationTest {

    @Resource
    private ApiClient apiClient;

    @Test
    void contextloads() {
        String result1 = apiClient.getNameByGet("lee");
        User user = new User();
        user.setUsername("lee");
        String result2 = apiClient.getUserNameByPost(user);
        System.out.println(result1);
        System.out.println(result2);
    }
}