package com.cwave.cobuyingserver.controller.v1.alarm.request;

import com.sun.istack.NotNull;
import lombok.Builder;

public record AlarmRequest(
        String type,
        @NotNull String content,
        @NotNull Long userId
){
    @Builder
    public AlarmRequest{
    }
}
