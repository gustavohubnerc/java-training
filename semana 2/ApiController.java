
package com.example.springapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/endpoint1")
    public String getEndpoint1() {
        return "GET Request to Endpoint 1";
    }

    @GetMapping("/endpoint2")
    public String getEndpoint2() {
        return "GET Request to Endpoint 2";
    }

    @PostMapping("/endpoint1")
    public String postEndpoint1(@RequestBody String request) {
        return "POST Request to Endpoint 1 with body: " + request;
    }

    @PostMapping("/endpoint2")
    public String postEndpoint2(@RequestBody String request) {
        return "POST Request to Endpoint 2 with body: " + request;
    }
}
