package com.example.redis.service;

import com.example.redis.entity.Board;
import com.example.redis.repository.BoardRepository;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@SpringBootTest
class BoardServiceTest {

    @Autowired
    BoardRepository boardRepository;

    @Nested
    @Transactional
    class ㅁㄴㅇㄹ {

        @Commit
        @Test
        public void  asdf() throws Exception {
            //given

            boardRepository.save(Board.builder().title("트랜잭zz션zzs").writer("asfd").build());
            //when

            //then

        }
    }

}