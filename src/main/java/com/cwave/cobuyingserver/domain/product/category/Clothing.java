package com.cwave.cobuyingserver.domain.product.category;

import com.cwave.cobuyingserver.domain.product.ProductEntity;
import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@DiscriminatorValue("C")
public class Clothing extends ProductEntity {
    private String color;
    private String size;
}
