package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyPageMapper {

    Member viewUserInfo(String uid);

    List<Order>viewOrderInfo(String uid);

}
