package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import com.example.atelier.domain.Product;
import org.springframework.stereotype.Repository;

@Repository("com.example.atelier.mapper.OrderMapper")
public interface OrderMapper {

    public Product getProductInfo(Long pid);
    public Member getUserInfo(String uid);
    public int orderInput(Order order);

}
