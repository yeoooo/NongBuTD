package com.td.NongbuTD.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Games {
    @Id
    @GeneratedValue
    private long id;

    private int round;
    private long compensation;
}
