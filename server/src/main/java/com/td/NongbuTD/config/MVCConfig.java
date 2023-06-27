package com.td.NongbuTD.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MVCConfig {
    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
