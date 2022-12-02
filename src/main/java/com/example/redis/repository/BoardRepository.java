package com.example.redis.repository;

import com.example.redis.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findAllById(Long id);

    Optional<Board> findById(Long id);

    List<Board> findByWriter(String writer);

    @Override
    void delete(Board entity);
}