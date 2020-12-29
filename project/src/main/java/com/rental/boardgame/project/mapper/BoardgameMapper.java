package com.rental.boardgame.project.mapper;

import com.rental.boardgame.project.domain.Boardgame;
import com.rental.boardgame.project.domain.BoardgameDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BoardgameMapper {

    public Boardgame mapToBoardgame(final BoardgameDto boardgameDto) {
        return new Boardgame(
                boardgameDto.getId(),
                boardgameDto.getTitle(),
                boardgameDto.getAuthor(),
                boardgameDto.getSort(),
                boardgameDto.getYearOfPublish(),
                boardgameDto.getQuantityOfPlayers());
    }

    public BoardgameDto mapToBoardgameDto(final Boardgame boardgame) {
        return new BoardgameDto(
                boardgame.getId(),
                boardgame.getTitle(),
                boardgame.getAuthor(),
                boardgame.getSort(),
                boardgame.getYearOfPublish(),
                boardgame.getQuantityOfPlayers());
    }

    public List<BoardgameDto> mapToBoardgameDtoList(final List<Boardgame> boardgameList) {
        return boardgameList.stream()
                .map(b -> new BoardgameDto(b.getId(), b.getTitle(), b.getAuthor(), b.getSort(), b.getYearOfPublish(), b.getQuantityOfPlayers()))
                .collect(Collectors.toList());
    }
}
