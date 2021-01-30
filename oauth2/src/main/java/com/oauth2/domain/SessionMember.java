package com.oauth2.domain;

import lombok.Getter;

import java.io.Serializable;

@Getter

//Member는 Entity라서 직렬화 기능을 가진 DTO하나 생성
public class SessionMember implements Serializable {

    private String email, name, picture;

    public SessionMember(Member member) {
        this.name = member.getName();
        this.email = member.getEmail();
        this.picture = member.getPicture();
    }
}
