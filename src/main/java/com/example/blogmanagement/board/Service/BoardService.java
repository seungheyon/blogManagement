package com.example.blogmanagement.board.Service;

import com.example.blogmanagement.board.Entity.Board;
import com.example.blogmanagement.board.Repository.BoardRepository;
import com.example.blogmanagement.board.dto.BoardRequestDto;
import com.example.blogmanagement.board.dto.BoardResponseDto;
import com.example.blogmanagement.board.dto.BoardUpdateDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void createBoard(BoardRequestDto boardRequestDto){
        boardRepository.save(Board.builder()
                .title(boardRequestDto.getTitle())
                .contents(boardRequestDto.getContents())
                .build());
    }

    public BoardResponseDto getBoard(Long boardId){
        Board board = boardRepository.findById(boardId)
                .orElseThrow();
        return BoardResponseDto.builder()
                .title(board.getTitle())
                .contents(board.getContents())
                .build();
    }

    @Transactional
    public void updateBoard(Long boardId, BoardUpdateDto boardUpdateDto){
        Board board = boardRepository.findById(boardId)
                .orElseThrow();
        board.updateBoard(boardUpdateDto);
    }

}
