package com.td.NongbuTD.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@ToString
@AllArgsConstructor

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private SkillCategory category;
    private long coolTime;
    private long price;
    private long[] upgrade_cost;

}
