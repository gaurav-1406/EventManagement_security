package com.example.demo.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Event;

@Repository

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByLocation(String location);
    List<Event> findByOwner_id(long id);
}
