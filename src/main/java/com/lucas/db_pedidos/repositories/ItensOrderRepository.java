package com.lucas.db_pedidos.repositories;

import com.lucas.db_pedidos.entities.ItensOrder;
import com.lucas.db_pedidos.entities.ItensOrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensOrderRepository extends JpaRepository<ItensOrder, ItensOrderId> {
}
