package com.example.blogmanagement.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardUpdateDto {
    private String title;
    private String contents;
}
