package com.example.ElectronicQueue.repository;

import com.example.ElectronicQueue.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
}
