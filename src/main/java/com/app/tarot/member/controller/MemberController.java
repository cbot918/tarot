package com.app.tarot.member.controller;

import com.app.tarot.member.service.MemberService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/v1/create")
    public MemberResponse createMemberController(@RequestBody MemberRequest memberRequest) {

        System.out.println("in /v1/create");

        return memberService.createMemberService(memberRequest);
    }
}
