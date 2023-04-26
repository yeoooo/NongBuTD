package com.td.NongbuTD.service;

import com.td.NongbuTD.domain.User;
import com.td.NongbuTD.domain.dto.UserDto;
import com.td.NongbuTD.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper = new ModelMapper();
    public Optional<User> findById(UUID uuid) {
        Optional<User> user = userRepository.findById(uuid);
        return user;
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public UserDto register(UserDto dto) {
        User entity = modelMapper.map(dto, User.class);
        userRepository.save(entity);

        return dto;
    }


}
