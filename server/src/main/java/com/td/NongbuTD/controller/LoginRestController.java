package com.td.NongbuTD.controller;

import com.td.NongbuTD.domain.User;
import com.td.NongbuTD.domain.dto.UserDto;
import com.td.NongbuTD.exception.NoSuchDataException;
import com.td.NongbuTD.service.LoginService;
import com.td.NongbuTD.service.UserService;
import com.td.NongbuTD.util.ApiResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoginRestController {
    private final UserService userService;


    /**
     * @param map
     * @return
     * @throws NoSuchDataException
     *
     * login 성공 여부에 따른 ApiResponse를 반환
     */
//    @GetMapping("/pmftd/api/v1/login")
//    public ApiResponse<UserDto> login(@RequestBody HashMap<String, String> map) throws NoSuchDataException {
//        ModelMapper modelMapper = new ModelMapper();
//        UUID id = UUID.fromString(map.get("id"));
//        String pw = map.get("pw");
//
//
//        return ApiResponse.ok(null);
//    }
}
