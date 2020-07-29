package com.example.atelier.service;

import com.example.atelier.domain.Cart;
import com.example.atelier.dto.CartRequestDto;
import com.example.atelier.mapper.CartMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CartService {

    private final CartMapper cartMapper;

    public List<Cart> cartList(String uid) {
        return cartMapper.cartList(uid);
    }

    @Transactional
    public void addCart(CartRequestDto requestDto) {
        cartMapper.addCart(requestDto.toEntity(requestDto));
    }

    @Transactional
    public void deleteCart(CartRequestDto requestDto){
        cartMapper.deleteCart(requestDto.getBno());
    }
}
