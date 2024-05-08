package com.example.ElectronicQueue.repository;

import com.example.ElectronicQueue.domain.Event;
import com.example.ElectronicQueue.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
