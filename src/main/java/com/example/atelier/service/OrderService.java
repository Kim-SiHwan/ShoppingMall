package com.example.atelier.service;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import com.example.atelier.domain.Product;
import com.example.atelier.dto.OrderRequestDto;
import com.example.atelier.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;

    public List<Product> getProductInfoService(List<Long> pid) {
        return orderMapper.getProductInfo(pid);
    }

    public Member getUserInfoService(String uid) {
        return orderMapper.getUserInfo(uid);
    }

    public void orderInputService(List<Long> pid, String uid, String orderAddress, List<String> orderPrice2) {
        for(int i=0; i< pid.size(); i++)
        {
            orderMapper.orderInput(pid.get(i),uid,orderAddress,orderPrice2.get(i));
        }
    }

}
