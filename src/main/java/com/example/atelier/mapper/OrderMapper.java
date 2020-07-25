package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import com.example.atelier.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {

    Product getProductInfo(Long pid);

    Member getUserInfo(String uid);

    int orderInput(Order order);

}
