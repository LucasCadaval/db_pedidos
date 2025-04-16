package com.lucas.db_pedidos.entities;

import jakarta.persistence.*;

@Table(name = "itens_order")
@Entity
public class ItensOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;

    @Column(name = "unit_price")
    private double unitPrice;
}
