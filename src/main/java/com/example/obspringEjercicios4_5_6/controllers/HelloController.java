package com.example.obspringEjercicios4_5_6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hola")
    public String saludo(){
        return "Hola a todos";
    }
}
