package com.wildcodeschool.rest_quest.repository;

import com.wildcodeschool.rest_quest.entity.Watched;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchedRepository extends JpaRepository<Watched, Long> {

}