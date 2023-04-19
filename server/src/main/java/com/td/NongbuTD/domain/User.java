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

    @OneToMany(mappedBy = "user")
    private List<UserFarmer> farmers;
    @OneToMany(mappedBy = "user")
    private List<UserQuest> quest;
    @OneToMany(mappedBy = "user")
    private List<UserItem> items;

}
