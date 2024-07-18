package com.app.tarot.member.dao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

}
