package com.example.atelier.dto;

import com.example.atelier.domain.Cart;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartRequestDto {
    private Long bno;
    private Long pid;
    private String uid;
    private int Quantity;
    private String totalPrice;
    private String CartUrl;

    public static Cart toEntity(CartRequestDto requestDto) {
        return Cart.builder()
                .bno(requestDto.getBno())
                .pid(requestDto.getPid())
                .uid(requestDto.getUid())
                .cartUrl(requestDto.getCartUrl())
                .quantity(requestDto.getQuantity())
                .totalPrice(requestDto.getTotalPrice())
                .build();
    }
}
