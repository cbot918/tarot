package com.app.tarot.member.dao;

import org.springframework.stereotype.Service;

@Service
public class MemberDaoImpl implements MemberDao {

    private final MemberRepository memberRepository;

    public MemberDaoImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void createMemberDao(MemberEntity memberEntity) {
        try{
            memberRepository.save(memberEntity);
        } catch(Exception e){
            System.out.println("Error while saving member: "+ e);
        }

    }

}
