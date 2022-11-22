package com.cwave.cobuyingserver.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    ProductEntity findByName (String name);
}
