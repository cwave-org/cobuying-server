package com.cwave.cobuyingserver.service.user.request;

import lombok.Builder;

public record CreateUserDto(
        String email,
        String nickname,
        String fcmToken,
        String profileImg
){
    @Builder
    public CreateUserDto {
    }
}
