package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     *
     * @return
     */
    @GetMapping("/list")
    @CrossOrigin
    public List<User> list(){
        List<User> list = userService.list();
        return list;
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping("/insert")
    @CrossOrigin
    public Boolean insert(@RequestBody User user){
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return userService.insert(user);
    }

    /**
     *
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/update")
    public Boolean update(@RequestParam Integer id,@RequestBody User user){
        return false;
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/get")
    public User getById(@RequestParam Integer id) {
        return new User();
    }

    /**
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete")
    public Boolean deleteById(@RequestParam Integer id) {
        return false;
    }
}
