package com.thkmon.ddoc.config.auth.dto;

import com.thkmon.ddoc.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * 이 객체는 인증된 사용자 정보만 보관.
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}