package com.wildcodeschool.rest_quest.controller;

import com.wildcodeschool.rest_quest.entity.ToWatch;

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

    @GetMapping("/towatch")
    public List<ToWatch> toWatchindex() {

        return toWatchRepository.findAll();
    }

    @GetMapping("/towatch/{id}")
    public ToWatch show(@PathVariable Long id) {

        return toWatchRepository.findById(id).get();
    }

    @RequestMapping(value = "/towatch", method = RequestMethod.POST)
    private String postToWatch(@RequestBody ToWatch toWatch) {
        toWatchRepository.save(toWatch);
        return "redirect:/toWatch";
    }

    @DeleteMapping("towatch/{id}")
    public boolean delete(@PathVariable Long id) {

        toWatchRepository.deleteById(id);
        return true;
    }

}