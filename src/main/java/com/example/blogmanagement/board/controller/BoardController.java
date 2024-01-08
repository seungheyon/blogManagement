package com.example.blogmanagement.board.controller;

import com.example.blogmanagement.board.service.BoardService;
import com.example.blogmanagement.board.dto.BoardRequestDto;
import com.example.blogmanagement.board.dto.BoardResponseDto;
import com.example.blogmanagement.board.dto.BoardUpdateDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/boards")
    public void boardCreate(@RequestBody BoardRequestDto boardRequestDto){
        boardService.createBoard(boardRequestDto);
    }

    @GetMapping("/boards/{boardId}")
    public BoardResponseDto getBoard(@PathVariable Long boardId){
        return boardService.getBoard(boardId);
    }

    @PutMapping("/boards/{boardId}")
    public void updateBoard(@PathVariable Long boardId, @RequestBody BoardUpdateDto boardUpdateDto){
        boardService.updateBoard(boardId, boardUpdateDto);
    }
}
