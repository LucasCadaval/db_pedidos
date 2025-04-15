package com.lucas.db_pedidos.repositories;

import com.lucas.db_pedidos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
