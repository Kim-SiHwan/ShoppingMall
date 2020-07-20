package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import org.springframework.stereotype.Repository;

@Repository("com.example.atelier.mapper.MyPageMapper")
public interface MyPageMapper {
    public Member viewUserInfo(String uid);
    public Order viewOrderInfo(String uid);

}
