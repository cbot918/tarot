package com.app.tarot.member.service;

import com.app.tarot.member.controller.MemberRequest;
import com.app.tarot.member.controller.MemberResponse;
import com.app.tarot.member.dao.MemberDao;
import com.app.tarot.member.dao.MemberEntity;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberDao memberDao;

    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public MemberResponse createMemberService(MemberRequest memberRequest) {

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setName(memberRequest.name());
        memberEntity.setEmail(memberRequest.email());
        memberEntity.setPassword(memberRequest.password());

        memberDao.createMemberDao(memberEntity);
        return new MemberResponse();
    }
}
