package com.td.NongbuTD.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
    @GeneratedValue
    @Id
    private Long id;

    private Long tower_atk;
    private Long tower_price;
    private Long coolTime;



}
