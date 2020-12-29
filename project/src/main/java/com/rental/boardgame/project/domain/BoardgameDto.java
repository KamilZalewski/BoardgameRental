package com.rental.boardgame.project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BoardgameDto {

    private Long id;
    private String title;
    private String author;
    private String sort;
    private Integer yearOfPublish;
    private String quantityOfPlayers;

}
