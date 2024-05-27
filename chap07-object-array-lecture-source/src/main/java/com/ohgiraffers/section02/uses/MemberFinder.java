package com.ohgiraffers.section02.uses;

public class MemberFinder {

    public Member[] findALLMembers() {

        return MemberRepository.findAllMembers();
    }
}
