package com.cwave.cobuyingserver.controller.v1.product;

import com.cwave.cobuyingserver.config.ResponseConfig;
import com.cwave.cobuyingserver.controller.v1.product.request.ProductFormRequest;
import com.cwave.cobuyingserver.controller.v1.product.response.ProductFormResponse;
import com.cwave.cobuyingserver.service.product.ProductServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    @PostMapping("")
    @ApiOperation(value = "공동구매할 상품을 등록한다.", response = ProductFormResponse.class)
    public ResponseEntity<?> createProduct(@RequestBody ProductFormRequest productFormRequest) {
        return productServiceImpl.createProduct(productFormRequest);
    }

    @GetMapping("")
    @ApiOperation(value = "상품을 조회한다.", response = ProductFormResponse.class)
    public ResponseEntity<?> getProduct(@RequestParam Long productId) {
        return productServiceImpl.getProduct(productId);
    }

    
}
