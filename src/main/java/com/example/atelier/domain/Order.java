package com.example.atelier.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Long ono;
    private String orderPrice;
    private String orderState;
    private String uid;
    private Long pid;
}
