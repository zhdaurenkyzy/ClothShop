package com.epam.shop.service;

import com.epam.shop.model.Product;
import com.epam.shop.model.Vendor;

import java.util.List;

public interface VendorService {

    List<Vendor> getAll();

    void create(Vendor vendor);

    Vendor getVendorById(Long id);

    void updateById(Vendor vendor);

    void deleteById(Long id);

    List<Product> getProductListByVendorId(Long id);

    void addProductToVendor(Long vendorId, Product product);
}
