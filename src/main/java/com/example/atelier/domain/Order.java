package com.example.atelier.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Order {
    private Long ono;
    private String orderPrice;
    private String orderState;
    private String orderAddress;
    private String uid;
    private Long pid;
}
