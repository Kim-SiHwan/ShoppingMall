package com.example.atelier.mapper;

import com.example.atelier.domain.Qna;
import com.example.atelier.dto.QnaRequestDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QnaMapper {

    int qnaCount(Long pid);

    int needAnswerCount();

    List<Qna> selectQnaList(Long pid);

    List<Qna> needAnswerList();

    void insertQna(Qna qna);

    List<Qna> selectQnaQuestion(Long qno);
}
