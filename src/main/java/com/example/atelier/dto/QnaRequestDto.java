package com.example.atelier.dto;

import com.example.atelier.domain.Qna;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaRequestDto {
    private Long qno;
    private Long pid;
    private String uid;
    private String question;
    private String answer;
    private String state;
    private String title;

    public static Qna toEntity(QnaRequestDto requestDto) {
        return Qna.builder()
                .pid(requestDto.getPid())
                .uid(requestDto.getUid())
                .question(requestDto.getQuestion())
                .answer(requestDto.getAnswer())
                .state(requestDto.getState())
                .title(requestDto.getTitle())
                .build();
    }
}
