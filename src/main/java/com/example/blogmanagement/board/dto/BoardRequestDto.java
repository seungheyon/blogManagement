package com.example.blogmanagement.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardRequestDto {
    private String title;
    private String contents;
}
