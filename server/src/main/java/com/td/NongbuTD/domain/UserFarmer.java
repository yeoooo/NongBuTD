package com.td.NongbuTD.domain;

import javax.persistence.*;
import lombok.ToString;

import java.io.Serializable;


@Entity
@ToString
public class UserFarmer{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;
}


