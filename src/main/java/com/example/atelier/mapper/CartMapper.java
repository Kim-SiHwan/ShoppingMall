package com.example.atelier.mapper;

import com.example.atelier.domain.Cart;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper {

    int addCart(Cart Cart);

    List<Cart> cartList(String uid);

    int deleteCart(Long bno);
}
