package com.td.NongbuTD.domain.dto;

import com.td.NongbuTD.domain.UserFarmer;
import com.td.NongbuTD.domain.UserItem;
import com.td.NongbuTD.domain.UserQuest;
import lombok.*;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto implements Serializable
{
    private UUID id;
    private String name;
    private String nickName;
    private String pw;
    private Long lastGame;
    private Long lastClear;
    private Long gold;
    private Long seed;

    private List<UserFarmer> farmers;
    private List<UserQuest> quest;
    private List<UserItem> items;
}
