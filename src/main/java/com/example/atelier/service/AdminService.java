package com.example.atelier.service;

import com.example.atelier.domain.Order;
import com.example.atelier.domain.Qna;
import com.example.atelier.dto.QnaRequestDto;
import com.example.atelier.mapper.AdminMapper;
import com.example.atelier.mapper.QnaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AdminService {

    private final AdminMapper adminMapper;
    private final QnaMapper qnaMapper;

    public List<Order> orderList(){
        return adminMapper.orderList();
    }

    @Transactional
    public void updateOrderState(List<Long> ono){ adminMapper.updateOrderState(ono);}

    @Transactional
    public void updateAnswer(QnaRequestDto requestDto){adminMapper.updateAnswer(requestDto);}

    public List<Qna> qnaList(){return qnaMapper.needAnswerList();}
}
