package com.app.tarot.member.service;

import com.app.tarot.member.controller.MemberRequest;
import com.app.tarot.member.controller.MemberResponse;

public interface MemberService {
    MemberResponse createMemberService(MemberRequest memberRequest);
}
