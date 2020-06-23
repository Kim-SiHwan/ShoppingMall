package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import org.springframework.stereotype.Repository;

@Repository("com.example.atelier.mapper.MemberMapper")
public interface MemberMapper {
    public Member findById(String uid);
    public void join(Member member);
}
