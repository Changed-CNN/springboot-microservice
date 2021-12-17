package com.melo.restful.webservice.restfulwebservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDAOService service;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }
    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }
    @PostMapping(path = "/users")
    public void createUser(@RequestBody User user){
        User savedUser = service.save(user);
    }
}
