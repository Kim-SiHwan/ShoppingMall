package com.example.atelier.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long pid;
    private String productContent;
    private String productTitle;
    private String productPrice;
    private String productType;
    private String productUrl;
}
