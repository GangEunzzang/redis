package com.example.redis.repository;

import com.example.redis.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findAllById(Long id);
}