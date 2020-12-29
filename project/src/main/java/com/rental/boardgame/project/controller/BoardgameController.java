package com.rental.boardgame.project.controller;

import com.rental.boardgame.project.domain.BoardgameDto;
import com.rental.boardgame.project.mapper.BoardgameMapper;
import com.rental.boardgame.project.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1")
public class BoardgameController {

    @Autowired
    private DbService service;

    @Autowired
    private BoardgameMapper boardgameMapper;

    @GetMapping(value = "/boardgames")
    public List<BoardgameDto> getBoardgames() {
        return boardgameMapper.mapToBoardgameDtoList(service.getAllBoardgames());
    }

    @GetMapping(value = "/boardgames/{boardgameId}")
    public BoardgameDto getBoardgame(@PathVariable Long boardgameId) throws BoardgameNotFoundException {
        return boardgameMapper.mapToBoardgameDto(service.getBoardgame(boardgameId).orElseThrow(BoardgameNotFoundException::new));
    }

    @PostMapping(value = "/boardgames", consumes = APPLICATION_JSON_VALUE)
    public void createBoardgame(@RequestBody BoardgameDto boardgameDto) {
        service.saveBoardgame(boardgameMapper.mapToBoardgame(boardgameDto));
    }

    @PutMapping(value = "/boardgames")
    public BoardgameDto updateBoardgame(@RequestBody BoardgameDto boardgameDto) {
        return boardgameMapper.mapToBoardgameDto(service.saveBoardgame(boardgameMapper.mapToBoardgame(boardgameDto)));
    }

    @DeleteMapping(value = "/boardgames/{boardgameId}")
    public void deleteBoardgame(@PathVariable Long boardgameId) {
        service.deleteBoardgame(boardgameId);
    }


}
