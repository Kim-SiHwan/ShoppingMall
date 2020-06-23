package com.example.atelier.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bucket {
    private Long bno;
    private int quantity;
    private String totalPrice;
    private String uid;
    private Long pid;
    private String bucketUrl;

}
