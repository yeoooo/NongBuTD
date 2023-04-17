package com.td.NongbuTD.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Crops {
    @GeneratedValue
    @Id
    private Long id;
    private String name;

    /**
     * 골드 생성 주기 (time)
     * gold/time 의 주기로 골드를 추가
     */
    private Long period;
    private Long gold;
    private Long price;
    private Long benefit;


}
