package com.td.NongbuTD.domain;


import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
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
