package com.cwave.cobuyingserver.config;

import lombok.Builder;

public record ResponseConfig(
        int code,
        String message,
        Object data
){
    @Builder
    public ResponseConfig {
    }
}
