package com.wildcodeschool.rest_quest.controller;


import com.wildcodeschool.rest_quest.entity.Movie;
import com.wildcodeschool.rest_quest.entity.Watched;
import com.wildcodeschool.rest_quest.repository.WatchedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class WatchedController {

    @Autowired
   WatchedRepository watchedRepository;

    @GetMapping("/watched")
    public List<Watched> watchedindex(){

        return watchedRepository.findAll();
    }

    @GetMapping("/watched/{id}")
    public Watched show(@PathVariable Long id) {

        return watchedRepository.findById(id).get();
    }

    @RequestMapping(value = "/watched", method = RequestMethod.POST)
    private String postWatched(@RequestBody Watched watched) {
        Watched watcheed = watchedRepository.save(watched);
        return "redirect:/watched";
    }




}