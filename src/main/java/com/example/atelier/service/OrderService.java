package com.example.atelier.service;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import com.example.atelier.domain.Product;
import com.example.atelier.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;

    public Product getProductInfoService(Long pid) {
        return orderMapper.getProductInfo(pid);
    }

    public Member getUserInfoService(String uid) {
        return orderMapper.getUserInfo(uid);
    }

    public int orderInputService(Order order) {
        return orderMapper.orderInput(order);
    }
}
