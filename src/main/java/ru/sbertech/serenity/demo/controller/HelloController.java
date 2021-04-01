package ru.sbertech.serenity.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "unknown") String name) {
        return String.format("Hello from Serenity, %s!", name);
    }
}
