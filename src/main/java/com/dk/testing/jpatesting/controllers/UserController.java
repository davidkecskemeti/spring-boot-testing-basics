package com.dk.testing.jpatesting.controllers;

import com.dk.testing.jpatesting.entities.UserEntity;
import com.dk.testing.jpatesting.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getUsers(){
        return userService.findAll();
    }
}
