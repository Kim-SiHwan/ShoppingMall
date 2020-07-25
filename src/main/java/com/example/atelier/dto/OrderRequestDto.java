package com.example.atelier.dto;

import com.example.atelier.domain.Order;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequestDto {

    private Long pid;
    private String uid;
    private String orderState;
    private String orderAddress;
    private String orderPrice;

    public static Order toEntity(OrderRequestDto requestDto) {
        return Order.builder()
                .pid(requestDto.getPid())
                .uid(requestDto.getUid())
                .orderAddress(requestDto.getOrderAddress())
                .orderPrice(requestDto.getOrderPrice())
                .orderState(requestDto.getOrderState())
                .build();
    }
}
