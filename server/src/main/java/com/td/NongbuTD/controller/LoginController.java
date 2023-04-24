package com.td.NongbuTD.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.td.NongbuTD.domain.User;
import com.td.NongbuTD.domain.dto.UserDto;
import com.td.NongbuTD.exception.NoSuchData;
import com.td.NongbuTD.service.LoginService;
import com.td.NongbuTD.service.UserService;
import com.td.NongbuTD.util.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoginController {
    private final UserService userService;
    private final LoginService loginService;

    /**
     * @param map
     * @return
     * @throws NoSuchData
     *
     * login 성공 여부에 따른 ApiResponse를 반환
     */
    @GetMapping("/api/v1/login")
    public ApiResponse<UserDto> login(@RequestBody HashMap<String, String> map) throws NoSuchData {
        UUID id = UUID.fromString(map.get("id"));
        String pw = map.get("pw");
        Optional<User> user = loginService.login(id, pw);
        if (user.isPresent()) {
            Optional<User> authorized = userService.findById(id);
            log.info("user {} is logged in ", authorized.get().getId());
            return ApiResponse.ok(new UserDto());
            /*
                new UserDto 안에 authorized 정보를 가지고 있어야 함
             */
        }else{
            return ApiResponse.fail(505, new UserDto());
        }



    }
}
