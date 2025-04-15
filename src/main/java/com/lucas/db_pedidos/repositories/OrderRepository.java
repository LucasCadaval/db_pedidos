package com.lucas.db_pedidos.repositories;

import com.lucas.db_pedidos.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
