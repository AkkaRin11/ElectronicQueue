package com.example.ElectronicQueue.rest.controller;

import com.example.ElectronicQueue.domain.User;
import com.example.ElectronicQueue.repository.UserRepository;
import com.example.ElectronicQueue.rest.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/user")
    public List<UserDto> getAllUsers(){
        return userRepository.findAll()
                .stream()
                .map(UserDto::toDto)
                .collect(Collectors.toList());
    }
}
