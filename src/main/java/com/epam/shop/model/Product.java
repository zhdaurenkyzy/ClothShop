package com.epam.shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "QUANTITY")
    private Long quantity;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_CATEGORY_ID")
    private Category category;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_VENDOR_ID")
    private  Vendor vendor;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<Item> itemList;

    @ElementCollection
    @CollectionTable(name = "PICTURE_PRODUCT", joinColumns = @JoinColumn(name = "PRODUCT_ID"))
    private List<String> pictureList;

}
