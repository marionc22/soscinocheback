package com.wildcodeschool.rest_quest.controller;

import com.wildcodeschool.rest_quest.entity.Movie;
import com.wildcodeschool.rest_quest.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @CrossOrigin
    @GetMapping("/")
    public String accueil(){

        return "okok";
    }
    @GetMapping("/movies")
    public List<Movie> index(){

        return movieRepository.findAll();
    }

    @GetMapping("/movies/{id}")
    public Movie show(@PathVariable Long id) {

        return movieRepository.findById(id).get();
    }

    @PostMapping("/movies")
    public Movie create(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

    @PutMapping("/movies/{id}")
    public Movie update(@PathVariable Long id, @RequestBody Movie movie) {

        Movie movieToUpdate = movieRepository.findById(id).get();
        movieToUpdate.setTitle(movie.getTitle());
        movieToUpdate.setDirector(movie.getDirector());
        movieToUpdate.setDescription(movie.getDescription());
        movieToUpdate.setImage(movie.getImage());
        return movieRepository.save(movieToUpdate);
    }

    @DeleteMapping("movies/{id}")
    public boolean delete(@PathVariable Long id) {

        movieRepository.deleteById(id);
        return true;
    }
}
