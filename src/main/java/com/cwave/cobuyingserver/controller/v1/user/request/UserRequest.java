package com.cwave.cobuyingserver.controller.v1.user.request;

import com.sun.istack.NotNull;
import lombok.Builder;

public record UserRequest(
        @NotNull String email,
        String nickname,
        String profileImg,
        String fcmToken
){
    @Builder
    public UserRequest{
    }
}
