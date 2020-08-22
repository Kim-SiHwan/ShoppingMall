package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import com.example.atelier.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {

    List<Product> getProductInfo(List<Long> pid);

    Member getUserInfo(String uid);

    boolean getBoolean(String uid, Long pid);

    int orderInput(Long pid, String uid, String orderAddress, String orderPrice);

    void updatePoint(Integer point, String uid);

    void deleteCart(Long pid, String uid);

    void deleteOrder(Long ono);


}
