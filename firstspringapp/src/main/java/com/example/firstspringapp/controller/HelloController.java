package com.example.firstspringapp.controller;
import com.example.firstspringapp.dto.User;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


}
