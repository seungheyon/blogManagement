package com.example.blogmanagement.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class BoardResponseDto {
    private String title;
    private String contents;
}
