package com.td.NongbuTD.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {
    @GeneratedValue
    @Id
    private Long id;

    private Long tower_atk;
    private Long tower_price;
    private Long coolTime;



}
