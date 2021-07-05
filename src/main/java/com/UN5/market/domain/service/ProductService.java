package com.UN5.market.domain.service;

import com.UN5.market.domain.Product;
import com.UN5.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public List<Product> getByRest(int restId){
        return productRepository.getByRest(restId);
    }

    public Product getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        return getProductooo(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }

    public Optional<Product> getProductooo(int productId) {
        return productRepository.getProductooo(productId);
    }


}
