package com.clincapi.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloword {
    @GetMapping
    public String olaMundo() {
        return "Hello Word Salvar";
    }
}