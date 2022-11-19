package org.example.repository;

import org.example.domain.Board;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardMapper {

    void createBoard(Board user);

    Board getBoardById(Long id);

    Board updateBoard(Board user);

    void deleteBoardById(Long id);
}
