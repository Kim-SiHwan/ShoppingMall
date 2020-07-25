package com.example.atelier.dto;

import com.example.atelier.domain.Bucket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartRequestDto {
    private Long pid;
    private String uid;
    private int Quantity;
    private String totalPrice;
    private String bucketUrl;

    public static Bucket toEntity(CartRequestDto requestDto) {
        return Bucket.builder()
                .pid(requestDto.getPid())
                .uid(requestDto.getUid())
                .bucketUrl(requestDto.getBucketUrl())
                .quantity(requestDto.getQuantity())
                .totalPrice(requestDto.getTotalPrice())
                .build();
    }
}
