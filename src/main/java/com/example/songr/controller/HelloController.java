package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam(name = "name", required = false) String name) {
        if (name != null) {
            return "Hello, " + name + "!";
        } else {
            return "Hello, World!";
        }
    }

    @PostMapping("/hello")
    public String sayHelloPost(@RequestBody String requestBody) {
        return "Hello from POST request!";
    }


    @Controller
    public static class SplashController {

        @GetMapping("/")
        public String splash() {
            return "splash";
        }
    }

}
