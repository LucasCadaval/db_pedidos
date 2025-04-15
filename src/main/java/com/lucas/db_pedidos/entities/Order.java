package com.lucas.db_pedidos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "orders")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "total_value")
    private double totalValue;
}
