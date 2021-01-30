package com.oauth2.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String email;
    private String name;
    private String picture;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Builder
    public Member(String name, String email, String picture, Role role) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }
    public Member update(String name, String picture) {
        this.name = name;
        this.picture = picture;
        return this;
    }
    public String getRole() {
        return this.role.getRole();
    }
}
