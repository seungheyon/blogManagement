package com.example.blogmanagement.board.entity;

import com.example.blogmanagement.board.dto.BoardUpdateDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String title;
    private String contents;

    public void updateBoard(BoardUpdateDto boardUpdateDto){
        this.title = boardUpdateDto.getTitle();
        this.contents = boardUpdateDto.getContents();
    }
}
