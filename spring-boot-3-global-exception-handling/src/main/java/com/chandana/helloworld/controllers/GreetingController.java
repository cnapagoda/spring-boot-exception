package com.chandana.helloworld.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    // GetMapping. Send GET requests to /api/greetings
    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }

    // Read PathVariable. Send GET requests to /api/greetings/{name}
    @GetMapping("/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // Read RequestBody. Send POST requests to /api/greetings
    @PostMapping
    public String greetWithPost(@RequestBody String name) {
        return "Greetings, " + name + "!";
    }

    // Read RequestParam. Send GET requests to
    // /api/greetings/query?name=ChandanaNapagoda
    @GetMapping("/query")
    public String greetWithRequestParam(@RequestParam String name) {
        return "Hello there, " + name + "!";
    }

    // Read RequestHeader. Send a request to /api/greetings/header
    @GetMapping("/header")
    public String greetWithHeader(@RequestHeader("X-Name") String name) {
        return "Welcome, " + name + "!";
    }

    // Custom HTTP response status for POST requests to /api/greetings/create
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createGreeting(@RequestBody String name) {
        return "Created greeting for " + name;
    }
}
