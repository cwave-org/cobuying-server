package com.cwave.cobuyingserver.service.product;

import com.cwave.cobuyingserver.config.ResponseConfig;
import com.cwave.cobuyingserver.controller.v1.product.request.ProductFormRequest;
import com.cwave.cobuyingserver.controller.v1.user.request.UserRequest;
import com.cwave.cobuyingserver.domain.product.ProductEntity;
import com.cwave.cobuyingserver.domain.product.ProductRepository;
import com.cwave.cobuyingserver.domain.user.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl {

    private final ProductRepository productRepository;

    //상품 등록
    public ResponseEntity<?> createProduct(ProductFormRequest productFormRequest) {

        //신규상품 검사
        ProductEntity productEntity = productRepository.findByName(productFormRequest.name());

        if(productEntity != null) {
            return ResponseEntity.status(200)
                    .body(ResponseConfig.builder()
                            .code(200)
                            .message("이미 등록된 상품입니다.")
                            .data(productEntity.getProductId())
                            .build());
        }

        productEntity = createProductEntity(productFormRequest);
        ProductEntity savedProductEntity = productRepository.save(productEntity);

        return ResponseEntity.status(200)
                .body(ResponseConfig.builder()
                        .code(200)
                        .message("새로 등록한 상품입니다.")
                        .data(productEntity.getProductId())
                        .build());
    }

    //상품 조회
    public ResponseEntity<?> getProduct(Long ProductId){
        ProductEntity productEntity = productRepository.findById(ProductId).orElse(null);
        if(productEntity != null){
            return ResponseEntity.status(200)
                    .body(ResponseConfig.builder()
                            .code(200)
                            .message("상품에 대한 정보입니다.")
                            .data("상품번호: " + productEntity.getProductId() + ", 상품명: " + productEntity.getName() + ", 상품가격: " + productEntity.getPrice())
                            .build());
        }
        return ResponseEntity.status(200)
                .body(ResponseConfig.builder()
                        .code(200)
                        .message("없는 상품입니다.")
                        .data(-1)
                        .build());
    }

    private ProductEntity createProductEntity(ProductFormRequest productFormRequest) {
        return ProductEntity.builder()
                .name(productFormRequest.name())
                .price(productFormRequest.price())
                .mainImage(productFormRequest.mainImage())
                .category(productFormRequest.category())
                .explanation(productFormRequest.explanation())
                .build();
    }

}
