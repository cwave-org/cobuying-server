package com.cwave.cobuyingserver.domain.product.category;

import com.cwave.cobuyingserver.domain.product.ProductEntity;
import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@DiscriminatorValue("S")
public class Stationery extends ProductEntity {
    private String size_x;
    private String size_y;
}
