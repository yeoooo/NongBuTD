package com.td.NongbuTD.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.ToString;

@Entity
@ToString
public class GameLog {
    @Id
    @GeneratedValue
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
    private User user;


}
