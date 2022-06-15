package com.example.demo.service;

import com.alibaba.testable.core.annotation.MockInvoke;
import com.example.demo.util.DataUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserServiceTest {

    @Resource
    UserService userService;

    public static class Mock {
        @MockInvoke(targetClass = DataUtil.class)
        public static String getData() {
            return "Fake Hello";
        }
    }

    @Test
    void getUserName() {
        String userName = userService.getUserName();
        System.out.println(userName);
        assertEquals("Fake Hello", userName);
    }
}