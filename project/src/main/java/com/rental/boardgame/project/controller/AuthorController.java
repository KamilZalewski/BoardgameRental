package com.rental.boardgame.project.controller;


import com.rental.boardgame.project.domain.BoardgameDto;
import com.rental.boardgame.project.mapper.BoardgameMapper;
import com.rental.boardgame.project.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/author")
public class AuthorController {

    @Autowired
    private DbService service;

    @Autowired
    private BoardgameMapper boardgameMapper;

    @GetMapping(value = "/boardgames/{authorsName}")
    public List<BoardgameDto> getGamesFromTheAuthor(@PathVariable String authorsName) {
        return boardgameMapper.mapToBoardgameDtoList(service.findAuthorOfGames(authorsName));
    }
}
