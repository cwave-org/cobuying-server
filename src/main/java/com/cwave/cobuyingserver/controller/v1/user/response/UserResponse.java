package com.cwave.cobuyingserver.controller.v1.user.response;

import lombok.Builder;

public record UserResponse(String id){
    @Builder
    public UserResponse{
    }
}