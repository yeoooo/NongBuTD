package com.td.NongbuTD.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Games {
    @Id
    @GeneratedValue
    private long id;

    private int round;
    private long compensation;

}
