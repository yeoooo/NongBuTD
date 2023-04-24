package com.td.NongbuTD.domain;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Tower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Long atk_power;
    private Long atk_range;
    private Long atk_speed;
    private Long price;
    private Long sell_price;
    private String type;
//    private long[] upgrade_cost;

}
