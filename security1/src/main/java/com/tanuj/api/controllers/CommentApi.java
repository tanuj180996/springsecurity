package com.tanuj.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/comments"))
public class CommentApi {
    @GetMapping
    public String get(){
        return "fetch comment";
    }
}
