package com.cwave.cobuyingserver.domain.product;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="category")
@Getter
public class CategoryEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="category_id")
    private Long id;

    @Column(name="name")
    private String name; //카테고리명
}
