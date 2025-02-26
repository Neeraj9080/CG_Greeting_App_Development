package com.mygreetingapp.MyGreetingApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController
{
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        return greetingService.getGreeting();
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
