package com.td.NongbuTD.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "farmers")
public class Farmer {
    @Id
    @GeneratedValue
    @Column(name="farmer_id")
    private long id;

    private String name;
    private Long price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
