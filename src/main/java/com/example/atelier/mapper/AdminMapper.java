package com.example.atelier.mapper;

import com.example.atelier.domain.Order;
import com.example.atelier.dto.QnaRequestDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
    List<Order> orderList();

    void updateOrderState(List<Long> ono);

    void updateAnswer(QnaRequestDto requestDto);

}
