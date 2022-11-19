package org.example.service;

import org.example.domain.Board;

public interface BoardService {
    Board getBoardInfo(long id);

    void createBoard(Board board);

    Board updateBoardInfo(Board board);

    void deleteBoard(long id);
}
