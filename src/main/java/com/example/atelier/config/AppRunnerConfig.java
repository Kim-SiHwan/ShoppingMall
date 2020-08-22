package com.example.atelier.config;

import com.example.atelier.domain.Member;
import com.example.atelier.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AppRunnerConfig implements ApplicationRunner {

    private final PasswordEncoder pwEncoder;
    private final MemberMapper memberMapper;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {

        Member member=Member.builder()
                .uid("관리자")
                .upw(pwEncoder.encode("1234"))
                .uname("김시환")
                .address("집주소")
                .call("폰넘버")
                .email("이메일")
                .role("ADMIN")
                .build();

        memberMapper.join(member);

        //Member member2=Member.createMember("시환",pwEncoder.encode("1234"));

        Member member2=Member.builder()
                .uid("시환")
                .upw(pwEncoder.encode("1234"))
                .uname("김시환")
                .address("집주소2")
                .call("폰넘버2")
                .email("이메일2")
                .role("USER")
                .build();

        memberMapper.join(member2);
    }
}
