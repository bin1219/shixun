package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> list();
    Boolean deleteById(Integer id);
    Boolean insert(User user);
    Boolean update(User user);
    User getById(Integer id);
    Integer getAccessById(Integer id);
    User getByNumber(String number);
}
