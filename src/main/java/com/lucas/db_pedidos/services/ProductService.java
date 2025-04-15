package com.lucas.db_pedidos.services;

import com.lucas.db_pedidos.entities.Product;
import com.lucas.db_pedidos.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product product) {
        Optional<Product> productOptional = productRepository.findById(id);
        if(productOptional.isPresent()) {
            Product productToUpdate = productOptional.get();

            productToUpdate.setName(product.getName());
            productToUpdate.setBrand(product.getBrand());
            productToUpdate.setStock(product.getStock());
            productToUpdate.setPrice(product.getPrice());

            return productRepository.save(productToUpdate);
        }
        return null;
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }


}
