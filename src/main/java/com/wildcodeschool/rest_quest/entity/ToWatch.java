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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ToWatch(String username, long movieId) {
        this.username = username;
        this.movieId = movieId;
    }

    ;
}

