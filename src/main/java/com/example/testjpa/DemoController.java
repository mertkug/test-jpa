package com.example.testjpa;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    private final UserService userService;

    public DemoController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public Users getUserById(@PathVariable("id") Users user) {
        return userService.getUser(user);
    }

    @PostMapping("/create-user")
    public void createPost(@RequestBody Users user){
        userService.saveUser(user);
    }

}
