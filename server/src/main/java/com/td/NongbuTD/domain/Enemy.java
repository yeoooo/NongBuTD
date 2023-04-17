package com.td.NongbuTD.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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
