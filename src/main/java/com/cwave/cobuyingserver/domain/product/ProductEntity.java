package com.cwave.cobuyingserver.domain.product;

import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="product")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="dtype")
@Getter
@NoArgsConstructor
public class ProductEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Long ProductId;

    //판매자DB와 1:N연결
    @NotNull
    @Column(name="seller_id")
    private Long sellerId;

    //카테고리 joinColumn -> 카테고리 마다 형식 다르게 가능한지
    @NotNull
    @Column(name="category")
    private String category;

    @NotNull
    @Column(name="name")
    private String name;

    @Column(name="main_image")
    private String mainImage;

    @NotNull
    @Column(name="price")
    private Long price;

    @Column(name="explanation")
    private String explanation;

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Long price) {this.price = price;}
    public void setExplanation(String explanation) {this.explanation = explanation;}
    public void setMainImage(String mainImage) {this.mainImage = mainImage;}
    public void setCategory(String category) {this.category = category;}

    @Builder
    public ProductEntity(String category, String name, String mainImage, Long price, String explanation) {
        this.category = category;
        this.name = name;
        this.mainImage = mainImage;
        this.price = price;
        this.explanation = explanation;
    }

}
