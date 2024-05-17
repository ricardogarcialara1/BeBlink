package com.beblink.h2.controller;

import com.beblink.h2.model.User;
import com.beblink.h2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type User controller.
 */
@RestController
@RequestMapping("h2/v0/users")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    /**
     * Create user user.
     *
     * @return the user
     */
    @PreAuthorize("hasAuthority('SAVE_ONE_PRODUCT')")
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @PreAuthorize("hasAuthority('READ_ALL_PRODUCTS')")
    @GetMapping
    public List<User> getAllUsers(){
        return userServiceImpl.getAllUsers();
    }

    @GetMapping("{id}")
    public User searchUserById(@PathVariable (value = "id", required = true) Long id){
        return userServiceImpl.getUserById(id);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable (value = "id", required = true) Long id){
        userServiceImpl.deleteUser(id);
    }
}
