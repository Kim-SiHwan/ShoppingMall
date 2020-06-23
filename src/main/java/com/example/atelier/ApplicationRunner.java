package com.example.atelier;

import com.example.atelier.domain.Member;
import com.example.atelier.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner{

    @Autowired
    PasswordEncoder pwEncoder;
    @Autowired
    MemberMapper memberMapper;
    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        Member member=new Member();
        member.setUid("관리자");
        String encodePw = pwEncoder.encode("1234");
        member.setUpw(encodePw);
        memberMapper.join(member);
        System.out.println(member.getUid()+" " +member.getUpw());
        member=new Member();
        member.setUid("시환");
        encodePw = pwEncoder.encode("1234");
        member.setUpw(encodePw);
        memberMapper.join(member);
        System.out.println(member.getUid()+" " +member.getUpw());
    }
}
