package com.rental.boardgame.project.service;

import com.rental.boardgame.project.domain.Boardgame;
import com.rental.boardgame.project.repository.BoardgameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DbService {

    @Autowired
    private BoardgameRepository repository;

    public List<Boardgame> getAllBoardgames() {
        return repository.findAll();
    }

    public Optional<Boardgame> getBoardgame(final Long id) {
        return repository.findById(id);
    }

    public Boardgame saveBoardgame(final Boardgame boardgame) {
        return repository.save(boardgame);
    }

    public void deleteBoardgame(final Long id) {
        repository.deleteById(id);
    }

    public List<Boardgame> findAuthorOfGames(String authorName) {
        return getAllBoardgames().stream().filter(b -> b.getAuthor().contains(authorName)).collect(Collectors.toList());
    }


}
