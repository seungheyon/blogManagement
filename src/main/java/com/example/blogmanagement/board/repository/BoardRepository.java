package com.example.blogmanagement.board.repository;

import com.example.blogmanagement.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
