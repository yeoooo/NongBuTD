package com.td.NongbuTD.domain;

import jakarta.persistence.*;

@Entity
/**
 * 유저가 소유하고 있는 아이템을
 */
public class UserItem {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;


}
