package com.example.jwtsecurity_login.models.auth;


import lombok.Getter;

@Getter
public class RefreshAuthTokenDto extends AuthTokenDto {
    private String signId;

    public RefreshAuthTokenDto(String signId, String accessToken, String refreshToken) {
        super(accessToken, refreshToken);
        this.signId = signId;
    }
}
