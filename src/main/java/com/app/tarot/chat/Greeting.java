package com.app.tarot.chat;

import lombok.Data;
import lombok.Getter;

@Getter
public class Greeting {
    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

}
