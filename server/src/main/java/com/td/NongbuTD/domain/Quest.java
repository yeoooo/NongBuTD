package com.td.NongbuTD.domain;

import javax.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@ToString
public class Quest {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String contents;
    private Long Compensation;
    /**
     * 퀘스트 내용 - 횟수 만족 퀘스트인 경우
     * 만족해야하는 횟수를 기입
     */
    private int count;
    /**
     * 퀘스트 내용 - 특정 조건 도달 퀘스트인 경우
     * 도달되어야 하는 game 기입
     */
    @OneToOne
    @JoinColumn(name = "games_id")
    private Games games;
    private LocalDateTime deadLine;


}
