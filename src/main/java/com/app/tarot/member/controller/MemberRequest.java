package com.app.tarot.member.controller;

import io.swagger.v3.oas.annotations.media.Schema;

public record MemberRequest(@Schema(example = "peko") String name, String email, String password){}
