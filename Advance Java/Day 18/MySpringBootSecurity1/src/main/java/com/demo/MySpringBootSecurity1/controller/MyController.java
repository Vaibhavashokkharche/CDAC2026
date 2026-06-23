package com.demo.MySpringBootSecurity1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String index() {
        return "Welcome";
    }

    @GetMapping("/home")
    public String home() {
        return "Public Home Page";
    }

    @GetMapping("/user/profile")
    public String userPage() {
        return "User Profile";
    }

    @GetMapping("/admin/dashboard")
    public String adminPage() {
        return "Admin Dashboard";
    }
}
