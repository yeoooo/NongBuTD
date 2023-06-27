package com.td.NongbuTD.service;

import com.td.NongbuTD.domain.User;
import com.td.NongbuTD.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class LoginService {

    private final UserRepository userRepository;


}
