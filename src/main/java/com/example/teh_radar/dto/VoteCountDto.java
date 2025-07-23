package com.example.teh_radar.dto;

import lombok.Data;

//Количество голосов за технологию по кольцам
@Data
public class VoteCountDto {

    private String ringName;
    private Long voteCount;

}
