package com.example.atelier.config;

import com.example.atelier.domain.Member;
import com.example.atelier.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppRunnerConfig implements ApplicationRunner {

    private final PasswordEncoder pwEncoder;
    private final MemberMapper memberMapper;

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
