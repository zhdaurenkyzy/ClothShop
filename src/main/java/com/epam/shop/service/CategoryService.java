package com.epam.shop.service;

import com.epam.shop.model.Category;
import com.epam.shop.model.Product;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    void create(Category category);

    Category getCategoryById(Long id);

    List<Product> getProductListByCategoryId(Long id);
}
