package com.example.demo.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "redirect:/index.html";
    }

    @GetMapping("/login")
    public String loginIndex() {
        return "redirect:/login.html";
    }

    @PostMapping("/login")
    public JSONPObject loginApi(@RequestBody JSONPObject json) {
        return json;
    }

    @GetMapping("/logout")
    public Boolean logout() {
        return false;
    }
}
