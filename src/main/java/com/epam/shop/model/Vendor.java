package com.epam.shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "VENDOR")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VENDOR_ID")
    private Long vendorId;
    @Column(name = "VENDOR_NAME")
    private String name;

    @OneToMany(mappedBy = "vendor", cascade = {CascadeType.REFRESH})
    private List<Product> products;

}
