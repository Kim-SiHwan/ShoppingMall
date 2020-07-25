package com.example.atelier.dto;

import com.example.atelier.domain.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {
    private Long pid;
    private String productContent;
    private String productTitle;
    private String productPrice;
    private String productType;
    private String productUrl;


    public static Product toEntity(ProductRequestDto requestDto) {
        return  Product.builder()
                .productContent(requestDto.productContent)
                .productTitle(requestDto.productTitle)
                .productPrice(requestDto.productPrice)
                .productUrl(requestDto.productUrl)
                .productType(requestDto.productType)
                .build();
    }
}
