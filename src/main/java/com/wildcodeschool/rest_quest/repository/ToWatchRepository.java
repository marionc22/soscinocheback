package com.wildcodeschool.rest_quest.repository;

import com.wildcodeschool.rest_quest.entity.ToWatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToWatchRepository extends JpaRepository<ToWatch, Long> {



}