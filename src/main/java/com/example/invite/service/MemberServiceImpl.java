package com.example.invite.service;

import com.example.invite.domain.member.Member;
import com.example.invite.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public List<Member> findAll(Member member) {
        return memberRepository.findAll(member);
    }

    @Override
    public Optional<Member> findById(String loginId) {
        return memberRepository.findById(loginId);
    }
}
