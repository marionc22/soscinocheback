package com.wildcodeschool.rest_quest.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class ToWatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @ManyToOne
    @JoinColumn(name = "movieId")
    private Movie movie;


    public ToWatch() {
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Movie getMovie() {
        return movie;
    }
    public void setMovieId(Movie movieId) {
        this.movie = movieId;
    }



    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}
