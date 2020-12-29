package com.rental.boardgame.project;

import com.rental.boardgame.project.domain.Boardgame;
import com.rental.boardgame.project.repository.BoardgameRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardgameRepositoryTestSuite {

    @Autowired
    private BoardgameRepository boardgameRepository;

    @Test
    public void testBoardgameRepositorySave() {
        //Given
        Boardgame boardgame = new Boardgame("7 cudów", "author", "strategic", 2015, "2,3,4");

        //When
        boardgameRepository.save(boardgame);
        //Then
        Long id = boardgame.getId();
        Optional<Boardgame> readBoardgame = boardgameRepository.findById(id);
        Assert.assertTrue(readBoardgame.isPresent());
        //CleanUp
        boardgameRepository.deleteById(id);
    }

}
