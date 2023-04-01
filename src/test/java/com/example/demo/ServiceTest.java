package com.example.demo;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ServiceTest {
    @Resource
    UserService userService;

    @Test
    public void selectById() {
        List<User> list = userService.list();
        System.out.println(list);
    }

    @Test
    public void test() {
        User user = new User();
        user.builder().id(1).name("lcb");
        System.out.println(user.toString());
    }
}
