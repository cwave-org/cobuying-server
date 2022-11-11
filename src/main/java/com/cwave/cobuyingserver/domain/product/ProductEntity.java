package com.cwave.cobuyingserver.domain.product;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="product")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="dtype")
@Getter
public abstract class ProductEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Long id;

    //판매자DB와 1:N연결
    @NotNull
    @Column(name="seller_id")
    private Long sellerId;

    //카테고리 joinColumn -> 카테고리 마다 형식 다르게 가능한지
    @NotNull
    @Column(name="category_id")
    private String categoryId;

    @NotNull
    @Column(name="name")
    private String name;

    @Column(name="main_image")
    private String mainImage;

    @NotNull
    @Column(name="price")
    private Long price;

    @Column(name="details")
    private String details;

}
