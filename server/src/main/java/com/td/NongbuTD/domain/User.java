package com.td.NongbuTD.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
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

    아이템은, 퀘스트, 농부 캐릭터는 항상 열려있으나 비활성화 상태. 따라서 id만 넣고 활성화해주는
    편으로 나아가는 것이 적합
     */
    @OneToMany(mappedBy = "user")
    private List<UserFarmer> farmers;
    @OneToMany(mappedBy = "user")
    private List<UserQuest> quest;
    @OneToMany(mappedBy = "user")
    private List<UserItem> items;

}
