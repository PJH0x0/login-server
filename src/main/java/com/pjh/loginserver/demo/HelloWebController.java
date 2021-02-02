package com.pjh.loginserver.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloWebController {
    @GetMapping("/")
    public String hello(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        Map<String, String> help = new HashMap<>();
        help.put("name", name);
        model.addAllAttributes(help);
        return "hello";
    }

}
