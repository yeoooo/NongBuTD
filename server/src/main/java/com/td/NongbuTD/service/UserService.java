package com.td.NongbuTD.service;

import com.td.NongbuTD.domain.User;
import com.td.NongbuTD.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> findById(UUID uuid) {
        Optional<User> user = userRepository.findById(uuid);
        return user;
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }


}
