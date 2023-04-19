package com.td.NongbuTD.domain;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class UserFarmer {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "farmer_id")
    private Farmer farmer;
}


