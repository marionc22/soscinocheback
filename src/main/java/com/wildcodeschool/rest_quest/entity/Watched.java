package com.wildcodeschool.rest_quest.entity;

import com.wildcodeschool.rest_quest.repository.WatchedRepository;

import javax.persistence.*;


@Entity
public class Watched {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private long movieId;

   @ManyToOne
   @JoinColumn(name = "movieId" , nullable = false , insertable = false, updatable = false)
    private Movie movie;

    public Watched() {
    }
    public Watched(String username) {
        this.username=username;
    };

    public Movie getMovie() {
        return movie;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Long getId(Long id){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername(String username){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
