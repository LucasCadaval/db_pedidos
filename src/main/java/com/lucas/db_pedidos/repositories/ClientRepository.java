package com.lucas.db_pedidos.repositories;

import com.lucas.db_pedidos.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
