package com.mayikt.controller;

import com.mayikt.entity.User;
import com.mayikt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @GetMapping("getUser/{id}")
    public User getUser(@PathVariable int id){
        return userService.selectById(id);
    }

    @GetMapping("getUser")
    public List<User> selectAll(){
        return userService.selectAll();
    }
}