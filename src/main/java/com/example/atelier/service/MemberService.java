package com.example.atelier.service;

import com.example.atelier.dto.MemberRequestDto;
import com.example.atelier.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;
    private final PasswordEncoder pwEncoder;

    @Transactional
    public void join(MemberRequestDto requestDto){
        requestDto.setUpw(pwEncoder.encode(requestDto.getUpw()));
        memberMapper.join(requestDto.toEntity(requestDto));
    }
}
