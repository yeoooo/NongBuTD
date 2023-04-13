package com.td.NongbuTD.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
public class Tower {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private long atk_point;
    private long atk_range;
    private long atk_speed;
    private long price;
    private String type;
    @OneToOne
    private Skill skill;

}
