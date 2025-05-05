package com.taskmanager.taskmanager.Controller;

import com.taskmanager.taskmanager.Entity.User;
import com.taskmanager.taskmanager.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/insertuser")
    public User InsertUser(@RequestBody User user)
    {
        return userService.InsertUser(user);
    }
}
