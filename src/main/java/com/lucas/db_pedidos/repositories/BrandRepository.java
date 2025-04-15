package com.lucas.db_pedidos.repositories;

import com.lucas.db_pedidos.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
