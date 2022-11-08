package com.cwave.cobuyingserver.controller.v1.product.response;

import lombok.Builder;

public record ProductFormResponse(String id){
    @Builder
    public ProductFormResponse{
    }
}
