package com.geekster.UserManagementSystem.Controller;

import com.geekster.UserManagementSystem.Modles.User;
import com.geekster.UserManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUserById(id);
    }

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user){
        return userService.addMyUser(user);
    }

    @DeleteMapping(value = "/deleteUser/{id}")
    public String deleteUserById(@PathVariable String id){
        return userService.deleteUserById(id);
    }

    @PutMapping(value = "/updateUserInfo/{id}")
    public String updateUserStatusById(@PathVariable String id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

}
