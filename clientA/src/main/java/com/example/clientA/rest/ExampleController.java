package com.example.clientA.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ExampleController {

    @GetMapping(path = "saludo/{name}")
    public String hello(@PathVariable("name") String name) {

        return "Hola desde microservicio A 2 " + name;

    }
}
