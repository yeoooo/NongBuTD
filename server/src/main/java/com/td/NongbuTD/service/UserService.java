package com.td.NongbuTD.service;

import com.td.NongbuTD.domain.User;
import com.td.NongbuTD.domain.dto.UserDto;
import com.td.NongbuTD.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
//        TypeMap<UserDto, User> userDtoToUserMap = modelMapper.createTypeMap(UserDto.class, User.class);
//        userDtoToUserMap.addMappings(mapper -> mapper.map(UserDto::getFarmers, User::setFarmers));
        userRepository.save(entity);

        return dto;
    }

    public UUID update(UUID id, UserDto dto) {
        Optional<User> user = userRepository.findById(id);
        dto.setId(id);
        userRepository.save(modelMapper.map(dto, User.class));
        return id;
    }




}
