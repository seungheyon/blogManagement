package com.example.blogmanagement.board.serviceTest;

import com.example.blogmanagement.board.dto.BoardRequestDto;
import com.example.blogmanagement.board.repository.BoardRepository;
import com.example.blogmanagement.board.service.BoardService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class BoardServiceTest {

    private final BoardRepository boardRepository;

    public BoardServiceTest(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @DisplayName("게시글 제목과 내용이 주어지면 테이블에 게시글이 추가된다.")
    @Test
    void BoardCreateTest(){
        // Arrange
        var sut = new BoardService(boardRepository);
        String title = "testTitle";
        String contents = "testContents";
        var boardRequestDto = new BoardRequestDto(title, contents);

        // Act
        var actual = sut.createBoard(boardRequestDto);

        // Assert
        assertThat(actual.getId()).isNotNull();
        assertThat(actual.getTitle()).isEqualTo(title);
        assertThat(actual.getContents()).isEqualTo(contents);
    }
}

