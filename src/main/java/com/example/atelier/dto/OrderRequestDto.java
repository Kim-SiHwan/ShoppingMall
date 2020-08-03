package com.example.atelier.dto;

import com.example.atelier.domain.Order;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderRequestDto {

    private Long ono;
    private Long pid;
    private String uid;
    private String orderState;
    private String orderAddress;
    private String orderPrice;
    private List<Long>oid;
    private List<String>orderPrice2;
    private List<OrderRequestDto> orderInfo;
    public static Order toEntity(OrderRequestDto requestDto) {
        return Order.builder()
                .ono(requestDto.getOno())
                .pid(requestDto.getPid())
                .uid(requestDto.getUid())
                .orderAddress(requestDto.getOrderAddress())
                .orderPrice(requestDto.getOrderPrice())
                .orderState(requestDto.getOrderState())
                .build();
    }
}
