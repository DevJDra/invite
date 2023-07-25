package com.example.invite.repository.member;

import com.example.invite.domain.member.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    void save(Member member);

    List<Member> findAll(Member member);

    Optional<Member> findById(String loginId);
}
