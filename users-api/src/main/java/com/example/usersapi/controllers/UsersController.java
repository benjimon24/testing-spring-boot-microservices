package com.example.usersapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.usersapi.models.User;
import com.example.usersapi.repositories.UserRepository;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

}
