package com.td.NongbuTD.util;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
public class DtoMapper {
    private final ModelMapper modelMapper;

    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
