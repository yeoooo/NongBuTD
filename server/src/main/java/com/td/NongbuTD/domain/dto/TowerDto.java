package com.td.NongbuTD.domain.dto;

import com.td.NongbuTD.domain.Tower;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.modelmapper.ModelMapper;

@AllArgsConstructor
@ToString
public class TowerDto {

    private ModelMapper modelMapper;

    public TowerDto(Tower tower) {
        modelMapper.map(tower, TowerDto.class);
    }


}