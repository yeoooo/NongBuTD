package com.td.NongbuTD.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID id;
    private String nickName;
    private String pw;
    private Long lastGame;
    private Long lastClear;
    private Long gold;
    private Long seed;
    /*

    아이템은 항상 열려있으나 비활성화 상태. 따라서 id만 넣고 활성화해주는
    편으로 나아가는 것이 적합
     */
//    @OneToMany(mappedBy = "User")
//    private List<Farmer> farmers;
//    @OneToMany(mappedBy = "User")
//    private List<Quest> quest;
//    @OneToMany(mappedBy = "User")
//    private List<Item> items;

}
