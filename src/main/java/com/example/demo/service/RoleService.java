package com.example.demo.service;

import com.example.demo.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> list();
    Boolean deleteById(Integer id);
    Boolean insert(Role role);
    Boolean update(Role role);
    Role getById(Integer id);
}
