package com.example.demo.service;

import com.example.demo.entity.Access;

import java.util.List;

public interface AccessService {
    List<Access> list();
    Boolean deleteById(Integer id);
    Boolean update(Access access);
    Boolean insert(Access access);
    Access getById(Integer id);
}
