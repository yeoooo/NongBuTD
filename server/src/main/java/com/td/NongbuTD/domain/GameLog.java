package com.td.NongbuTD.domain;


import jakarta.persistence.ManyToOne;
import lombok.ToString;

@ToString
public class GameLog {
    private Long id;
    /**
     * 챕터 정보
     */
    private Long game_id;
    /**
     * 클리어 여부
     */
    private Boolean is_clear;

    @ManyToOne
    private Long user;


}
