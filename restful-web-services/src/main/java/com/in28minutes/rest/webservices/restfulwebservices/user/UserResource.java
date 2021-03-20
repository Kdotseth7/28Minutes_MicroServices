package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;
    
    //retrieveAllUsers
    @GetMapping(path="/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    //retrieveUser
    @GetMapping(path="/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

    //saveUser
    @PostMapping


}