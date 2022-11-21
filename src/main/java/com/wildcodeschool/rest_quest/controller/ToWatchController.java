package com.wildcodeschool.rest_quest.controller;

import com.wildcodeschool.rest_quest.entity.ToWatch;
import com.wildcodeschool.rest_quest.entity.Watched;
import com.wildcodeschool.rest_quest.repository.ToWatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ToWatchController {

    @Autowired
    ToWatchRepository toWatchRepository;

    @GetMapping("/toWatch")
    public List<ToWatch> toWatchindex() {

        return toWatchRepository.findAll();
    }

    @GetMapping("/toWatch/{id}")
    public ToWatch show(@PathVariable Long id) {

        return toWatchRepository.findById(id).get();
    }

}