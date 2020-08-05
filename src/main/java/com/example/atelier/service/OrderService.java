package com.example.atelier.service;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Product;
import com.example.atelier.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;

    public List<Product> getProductInfo(List<Long> pid) {
        return orderMapper.getProductInfo(pid);
    }

    public Member getUserInfo(String uid) {
        return orderMapper.getUserInfo(uid);
    }

    @Transactional
    public void orderInput(List<Long> pid, String uid, String orderAddress, List<String> orderPrice2) {
        Integer point=0;
        for(int i=0; i< pid.size(); i++)
        {
            orderMapper.orderInput(pid.get(i),uid,orderAddress,orderPrice2.get(i));
            point+= Integer.parseInt(orderPrice2.get(i));
            deleteCart(pid.get(i),uid);
        }
        point=point/90;
        updatePoint(point,uid);

    }

    @Transactional
    public void updatePoint(Integer point, String uid)
    {
        orderMapper.updatePoint(point,uid);
    }

    @Transactional
    public void deleteCart(Long pid, String uid)
    {
        orderMapper.deleteCart(pid,uid);
    }

    @Transactional
    public void deleteOrder(Long ono){
        orderMapper.deleteOrder(ono);
    }


}
