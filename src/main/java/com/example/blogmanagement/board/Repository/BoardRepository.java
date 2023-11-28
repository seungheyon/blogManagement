package com.example.blogmanagement.board.Repository;

import com.example.blogmanagement.board.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
