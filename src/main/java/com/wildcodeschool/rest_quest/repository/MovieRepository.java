package com.wildcodeschool.rest_quest.repository;


import com.wildcodeschool.rest_quest.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findAllByTitleContainsOrDescriptionContains(String title, String description);

}
