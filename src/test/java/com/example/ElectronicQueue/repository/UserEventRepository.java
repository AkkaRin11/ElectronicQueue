package com.example.ElectronicQueue.repository;


import com.example.ElectronicQueue.domain.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEventRepository extends JpaRepository<UserEvent, Integer> {

}
