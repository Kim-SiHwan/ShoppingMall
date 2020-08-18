package com.example.atelier.service;

import com.example.atelier.domain.Qna;
import com.example.atelier.dto.QnaRequestDto;
import com.example.atelier.mapper.QnaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class QnaService {
    private final QnaMapper qnaMapper;

    public List<Qna> qnaList(Long pid){
        return qnaMapper.selectQnaList(pid);
    }

    @Transactional
    public void insertQna(QnaRequestDto requestDto){
        qnaMapper.insertQna(requestDto.toEntity(requestDto));
    }

}
