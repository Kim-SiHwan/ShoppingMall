package com.example.atelier.dto;

import com.example.atelier.domain.Review;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewRequestDto {

    private Long pid;
    private String uid;
    private String content;

    public static Review toEntity(ReviewRequestDto requestDto) {
        return Review.builder()
                .pid(requestDto.getPid())
                .uid(requestDto.getUid())
                .content(requestDto.getContent())
                .build();
    }
}
