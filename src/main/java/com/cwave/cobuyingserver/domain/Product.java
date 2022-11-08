package com.cwave.cobuyingserver.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="item")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long productId;

    @Column(name="category")
    private String category;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private Long price;

    @Column(name="chatting_link")
    private String chattingLink;

    @Column(name="thumbnail_image")
    private String thumbnailImage;

    @Column(name="explanation")
    private String explanation;

}
