package com.epam.shop.service;

import com.epam.shop.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    void create(Product product);

    Product getProductById(Long id);

    void update(Product product);

    void delete(Long id);

    List<String> getPicturesByProductId(Long Id);

    void updateOrAddPicture(Long productId, String picture);
}
