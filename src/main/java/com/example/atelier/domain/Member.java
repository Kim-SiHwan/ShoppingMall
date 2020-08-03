package com.example.atelier.domain;

import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class Member {

    private String uid;
    private String upw;
    private String uname;
    private String address;
    private String call;
    private String email;
    private Integer point;



}
