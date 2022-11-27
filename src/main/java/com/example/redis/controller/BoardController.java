package com.example.redis.controller;

import com.example.redis.entity.Board;
import com.example.redis.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @Cacheable(value = "Board", key = "#id", cacheManager = "cacheManager", unless = "#id == ''")
    @GetMapping("/list")
    public List<Board> getList() {
        return boardService.getList();
    }

    @Cacheable(value = "Board", key = "#id", cacheManager = "cacheManager")
    @GetMapping("/get")
    public Board getById(Long id) {
        return boardService.getById(id);
    }

    @Cacheable(value = "List<Board>", key = "#writer", cacheManager = "cacheManager")
    @GetMapping("/writer")
    public List<Board> getByWriter(String writer) {
        return boardService.getByWriter(writer);
    }


}