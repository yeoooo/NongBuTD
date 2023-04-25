package com.td.NongbuTD.domain;



import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GameLog {
    @Id
    @GeneratedValue
    @Column(name = "log_id")
    private Long id;
    /**
     * 챕터 정보
     */

    private long game_id;

    /**
     * 클리어 여부
     */
    private Boolean is_clear;

    private UUID user_id;


}
