package com.example.JSON.response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/greet")
    public HelloResponse greet() {
        return new HelloResponse("Hello world");
    }

    @PostMapping("/greet")
    public HelloResponse greet(@RequestBody String name) {
        return new HelloResponse("Hello " + name);
    }
}
