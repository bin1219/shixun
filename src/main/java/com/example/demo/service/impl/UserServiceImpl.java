package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     *
     * @return
     */
    @Override
    public List<User> list() {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteById(Integer id) {
        return false;
    }

    /**
     *
     * @param user
     * @return
     */
    @Override
    public Boolean insert(User user) {
        return false;
    }

    /**
     *
     * @param user
     * @return
     */
    @Override
    public Boolean update(User user) {
        return false;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public User getById(Integer id) {
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Integer getAccessById(Integer id) {
        return null;
    }

    /**
     *
     * @param number
     * @return
     */
    @Override
    public User getByNumber(String number) {
        return null;
    }
}
