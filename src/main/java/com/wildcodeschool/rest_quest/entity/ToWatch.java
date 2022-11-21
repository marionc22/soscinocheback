package com.wildcodeschool.rest_quest.entity;

import javax.persistence.*;
import java.util.List;


@Entity
public class ToWatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private long movieId;
    @ManyToOne
    @JoinColumn(name = "movieId", nullable = false, insertable = false, updatable = false)
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
    public void setMovie(Movie movie) {
        this.movie = movie;
    }



    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




}

