package com.example.atelier.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Qna {
    private Long qno;
    private Long pid;
    private String uid;
    private String question;
    private String answer;
    private String state;
    private String title;
}
