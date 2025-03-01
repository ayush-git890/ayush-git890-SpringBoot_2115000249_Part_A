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

    @GetMapping("/query")
    public String sayHelloRequestParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/param/{name}")
    public String sayHelloPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
