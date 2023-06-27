package com.td.NongbuTD.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.td.NongbuTD.domain.dto.UserDto;
import com.td.NongbuTD.service.UserService;
import com.td.NongbuTD.util.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserRestController {

    private final UserService userService;
    @PostMapping("/pmftd/api/v1/user/register/")
    public ApiResponse<String> register(@RequestBody HashMap<String, Object> map) throws JsonProcessingException {
        ModelMapper modelMapper = new ModelMapper();
        Map<String, Object> data = (HashMap<String, Object>)map.get("data");
        UserDto dto = modelMapper.map(data, UserDto.class);

        log.info("[USER CONTROLLER] new User {} has registered.", dto.toString());
        userService.register(dto);
        return ApiResponse.ok("success");
    }

}
