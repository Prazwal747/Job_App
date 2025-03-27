package com.app.demo.controller;

import com.app.demo.module.User;
import com.app.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v0.1/job/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }



}
