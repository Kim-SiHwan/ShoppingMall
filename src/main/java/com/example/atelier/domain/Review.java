package com.example.atelier.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
public class Review {
    private Long rno;
    private String content;
    private String uid;
    private Long pid;
    private int point;
}
