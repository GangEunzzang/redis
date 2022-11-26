package com.example.redis.service;


import com.example.redis.entity.Board;
import com.example.redis.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public Board getList(Long id) {
        return boardRepository.findAll(id);
    }


}
