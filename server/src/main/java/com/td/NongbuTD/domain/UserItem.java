package com.td.NongbuTD.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
/**
 * yeoooo
 * 유저가 소유하고 있는 아이템으로 구성되어있는 관계형 테이블
 * --- --- --- --- --- --- --- --- --- --- --- ---
 * 복합 키 테이블은 Serializable이 구현되어 있어야 함.
 * 이는 복합키의 경우 테이블이 크게 늘어날 가능성이 있고, 이를 처리하기 위해서 hibernate는 디스크에 일시적으로 저장해야한다고 함.
 * 디스크에 데이터를 저장하기 위해서는 직렬화가 필요.
 */
public class UserItem implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;


}
