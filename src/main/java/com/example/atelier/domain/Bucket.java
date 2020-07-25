package com.example.atelier.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class Bucket {
    private Long bno;
    private int quantity;
    private String totalPrice;
    private String uid;
    private Long pid;
    private String bucketUrl;

}
