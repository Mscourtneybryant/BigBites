package com.personnelprocapstone.capstonebackendpersonnelpro.repository;

import com.personnelprocapstone.capstonebackendpersonnelpro.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByDateBetween(LocalDate startDate, LocalDate endDate);
}