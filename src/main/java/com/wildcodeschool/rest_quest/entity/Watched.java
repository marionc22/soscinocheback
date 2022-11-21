package com.wildcodeschool.rest_quest.entity;

import com.wildcodeschool.rest_quest.repository.MovieRepository;
import com.wildcodeschool.rest_quest.repository.WatchedRepository;

import javax.persistence.*;


@Entity
public class Watched {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

     @ManyToOne(fetch=FetchType.EAGER)
   @JoinColumn(name = "movieId")
    private Movie movie;

    public Watched() {
    }

    public Watched(String username, Movie movie) {
        this.username=username;
        this.movie=movie;
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
