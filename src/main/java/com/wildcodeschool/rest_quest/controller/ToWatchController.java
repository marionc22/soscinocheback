package com.wildcodeschool.rest_quest.controller;


import com.wildcodeschool.rest_quest.repository.ToWatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToWatchController {

    @Autowired
    ToWatchRepository toWatchRepository;

    @GetMapping("/ola")
    public String accueil(){

        return "mdr";
    }
}