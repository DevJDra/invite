package com.example.invite.repository.member;

import com.example.invite.domain.member.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final MemberMapper memberMapper;

    public Member save(Member member) {
        log.info("MemberMapper class={}", memberMapper.getClass());
        memberMapper.save(member);
        return member;
    }

    public List<Member> findAll(Member member) {
        return memberMapper.findAll(member);
    }

    public Optional<Member> findById(String loginId) {

        return memberMapper.findById(loginId);
    }
}
