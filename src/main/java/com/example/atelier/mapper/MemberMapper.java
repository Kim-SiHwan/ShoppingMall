package com.example.atelier.mapper;

import com.example.atelier.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {

    Member findById(String uid);

    void join(Member member);
}
