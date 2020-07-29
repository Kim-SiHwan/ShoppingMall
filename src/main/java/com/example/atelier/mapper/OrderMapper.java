package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Order;
import com.example.atelier.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    List<Product> getProductInfo(List<Long> pid);

    Member getUserInfo(String uid);

    int orderInput(Long pid, String uid, String orderAddress, String orderPrice);

}
