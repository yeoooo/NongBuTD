package com.td.NongbuTD.domain;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "farmers")
@ToString
public class Farmer {
    @Id
    @GeneratedValue
    @Column(name="farmer_id")
    private long id;

    private String name;
    private Long price;
}
