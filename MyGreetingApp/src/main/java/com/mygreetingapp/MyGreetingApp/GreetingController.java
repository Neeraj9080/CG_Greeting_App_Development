package com.mygreetingapp.MyGreetingApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController
{
    @GetMapping
    public String getGreeting() {
        return "Hello World";
    }

    @PostMapping
    public String createGreeting() {
        return "Greeting created";
    }

    @PutMapping
    public String updateGreeting() {
        return "Greeting updated";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "Greeting deleted";
    }
}
