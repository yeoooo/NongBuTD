package com.td.NongbuTD.domain;

import javax.persistence.*;
import lombok.ToString;

import java.io.Serializable;

@Entity
@ToString
public class UserFarmer implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;
}


