package com.rental.boardgame.project.repository;

import com.rental.boardgame.project.domain.Boardgame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BoardgameRepository extends CrudRepository<Boardgame, Long> {

    @Override
    List<Boardgame> findAll();

}
