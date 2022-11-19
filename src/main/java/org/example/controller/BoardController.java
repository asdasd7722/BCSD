package org.example.controller;


import org.example.domain.Board;
import org.example.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping()
    public String createBoard(@RequestBody Board board) {
        boardService.createBoard(board);

        return "create board";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Board BoardInfo(@PathVariable("id") Long id) {
        return boardService.getBoardInfo(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Board updateBoard(Board board) {
        return boardService.updateBoardInfo(board);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBoard(@PathVariable("id") Long id) {
        boardService.deleteBoard(id);
        return "delete Board";
    }

}
