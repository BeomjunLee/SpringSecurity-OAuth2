package com.oauth2.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public enum Role {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");

    private String role;

    Role(String role) {
        this.role = role;
    }
}
