package com.example.atelier.dto;

import com.example.atelier.domain.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@RequiredArgsConstructor
public class MemberRequestDto {
    private final PasswordEncoder pwEncoder;

    private String uid;
    private String upw;
    private String uname;
    private String address;
    private String call;
    private String email;
    private String role;

    public static Member toEntity(MemberRequestDto requestDto) {

        return Member.builder()
                .uid(requestDto.getUid())
                .upw(requestDto.getUpw())
                .uname(requestDto.getUname())
                .address(requestDto.getAddress())
                .call(requestDto.getCall())
                .email(requestDto.getEmail())
                .role("USER")
                .build();
    }

}
