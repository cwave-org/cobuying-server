package com.cwave.cobuyingserver.controller.v1.product.request;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;

public record ProductFormRequest(
        @NotNull @ApiModelProperty(example = "의류") String category,
        @NotNull @ApiModelProperty(example = "흰색 티") String name,
        @NotNull @ApiModelProperty(example = "10000" ) Long price,
        @NotNull @ApiModelProperty(example = "채팅방링크") String chattingLink,
        @ApiModelProperty(example = "대표사진") String thumbnailImage,
        @ApiModelProperty(example = "기타 상품설명") String explanation
){
}

