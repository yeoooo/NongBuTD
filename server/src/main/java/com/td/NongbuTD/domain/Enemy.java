package com.td.NongbuTD.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Enemy {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long speed;
    private Long def;
    /**
     * yeoooo
     * 공중과 지상을 나누는 E(nemy)TYPE
     */
    private ETYPE type;
    /**
     * yeoooo
     * 목숨 차감 수
     */
    private Long damage;



}
