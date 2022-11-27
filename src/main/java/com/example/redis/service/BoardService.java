package com.example.redis.service;


import com.example.redis.entity.Board;
import com.example.redis.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> getList() {
        return boardRepository.findAll();
    }

    public Board getById(Long id) {
        return boardRepository.findById(id).get();
    }

    public List<Board> getByWriter(String writer) {
        return boardRepository.findByWriter(writer);
    }


}
