package com.liftoff.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "PRODUCTS")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true)
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SKU")
    private String sku;

    @Column(name = "REGULAR_PRICE")
    private Double regularPrice;

    @Column(name = "DISCOUNT_PRICE")
    private Double discountPrice;

    @Column(name = "DISCOUNT_PRICE_END_DATE")
    private LocalDateTime discountPriceEndDate;

    @Column(name = "LOWEST_PRICE")
    private Double lowestPrice;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SHORT_DESCRIPTION")
    private String shortDescription;

    @Column(name = "NOTE")
    private String note;

    @Column(name = "PUBLISHED")
    private Byte published;

    @Column(name = "PRODUCTSCOL")
    private String productscol;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "PRODUCTS_CATEGORIES",
            joinColumns = {@JoinColumn(name = "PRODUCTS_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "CATEGORIES_ID", referencedColumnName = "ID")})
    private Set<Category> categories;
}
