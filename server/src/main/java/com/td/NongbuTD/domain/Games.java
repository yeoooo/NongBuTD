package com.td.NongbuTD.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Games {
    @Id
    @GeneratedValue
    private long id;

    private int round;
    private long compensation;
}
