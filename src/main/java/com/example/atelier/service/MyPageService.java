package com.example.atelier.service;


import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import com.example.atelier.mapper.MyPageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MyPageService {

    private final MyPageMapper myPageMapper;

    public Member viewUserInfoService(String uid) {
        return myPageMapper.viewUserInfo(uid);
    }
    public List<Order> viewOrderInfoService(String uid){
        return myPageMapper.viewOrderInfo(uid);
    }


}
