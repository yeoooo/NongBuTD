package com.td.NongbuTD.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.td.NongbuTD.domain.dto.UserDto;
import com.td.NongbuTD.service.UserService;
import com.td.NongbuTD.util.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/pmftd/api/v1/user/register/")
    public ApiResponse<String> register(@RequestBody HashMap<String, String> map) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserDto dto = objectMapper.readValue(map.toString(), UserDto.class);
        userService.register(dto);
        return ApiResponse.ok("success");
    }

}
