package com.pjh.loginserver.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/rest")
    public User getUser(@RequestParam(value = "name", defaultValue = "1") String name) {
        return new User(1, name);
    }
    @PostMapping("/rest")
    public User getUserByPost(@RequestParam(value = "name", defaultValue = "1") String name) {
        return new User(2, name);
    }
}
