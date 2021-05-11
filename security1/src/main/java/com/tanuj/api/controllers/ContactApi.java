package com.tanuj.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactApi {
    @GetMapping
    public String get(){
        return "fetch contacts";
    }
}
