package com.example.invite.service;

import com.example.invite.domain.member.Member;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    Member save(Member member);

    List<Member> findAll(Member member);

    Optional<Member> findById(String loginId);
}
