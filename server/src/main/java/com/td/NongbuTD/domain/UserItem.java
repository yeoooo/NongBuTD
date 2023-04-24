package com.td.NongbuTD.domain;

import javax.persistence.*;

@Entity
/**
 * 유저가 소유하고 있는 아이템으로 구성되어있는 관계형 테이블
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
