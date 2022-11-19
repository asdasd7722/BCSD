package org.example.service;

import org.example.domain.Board;
import org.example.repository.BoardMapper;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public Board getBoardInfo(long id) {
        return boardMapper.getBoardById(id);
    }

    @Override
    public void createBoard(Board board) {
        boardMapper.createBoard(board);
    }

    @Override
    public Board updateBoardInfo(Board board) {
        return boardMapper.updateBoard(board);
    }

    @Override
    public void deleteBoard(long id) {
        boardMapper.deleteBoardById(id);
    }
}
