package com.musicshop.controller.product;

import com.musicshop.model.product.Product;
import com.musicshop.repository.product.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long productId) {
        return productRepository.findById(productId);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }
}
