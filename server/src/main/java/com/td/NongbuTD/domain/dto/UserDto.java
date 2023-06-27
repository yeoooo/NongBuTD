package com.td.NongbuTD.domain.dto;

import com.td.NongbuTD.domain.Tower;
import com.td.NongbuTD.domain.UserFarmer;
import com.td.NongbuTD.domain.UserItem;
import com.td.NongbuTD.domain.UserQuest;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDto
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
    private List<Tower> towers;
}
