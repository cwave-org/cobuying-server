package com.cwave.cobuyingserver.controller.v1.product;

import com.cwave.cobuyingserver.config.ResponseConfig;
import com.cwave.cobuyingserver.controller.v1.product.request.ProductFormRequest;
import com.cwave.cobuyingserver.controller.v1.product.response.ProductFormResponse;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    @PostMapping("")
    @ApiOperation(value = "공동구매할 상품을 등록한다.", response = ProductFormResponse.class)
    public ResponseEntity<?> createProduct(@RequestBody ProductFormRequest productFormRequest) {
        return ResponseEntity.status(200)
                .body(ResponseConfig.builder()
                        .code(200)
                        .message("success")
                        .data(ProductFormResponse.builder().id("10001").build())
                        .build());
    }
}
