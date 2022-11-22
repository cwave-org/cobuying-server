package com.cwave.cobuyingserver.controller.v1.product.request;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;

public record ProductFormRequest(
        @NotNull @ApiModelProperty(example = "의류") String category,
        @NotNull @ApiModelProperty(example = "흰색 티") String name,
        @NotNull @ApiModelProperty(example = "10000" ) Long price,
        @ApiModelProperty(example = "대표사진") String mainImage,
        @ApiModelProperty(example = "기타 상품설명") String explanation
){
    @Builder
    public ProductFormRequest{
    }
}

