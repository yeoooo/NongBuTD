package com.td.NongbuTD.service;

import com.td.NongbuTD.domain.User;
import com.td.NongbuTD.domain.dto.UserDto;
import com.td.NongbuTD.exception.NoSuchData;
import com.td.NongbuTD.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class LoginService {

    private final UserRepository userRepository;

    public Optional<User> login(UUID id, String pw) throws NoSuchData {
        Optional<User> unAuthorized = userRepository.findById(id);
        if (unAuthorized.isEmpty()){
            throw new NoSuchData("UserData");
        }
        if (pw.equals(unAuthorized)) {
            return unAuthorized;
        }
        return Optional.of(null);
    }


}
