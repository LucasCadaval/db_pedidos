package com.lucas.db_pedidos.entities;

import jakarta.persistence.*;

@Table(name = "itens_order")
@Entity
public class ItensOrder {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order order;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    private int quantity;

    @Column(name = "unit_price")
    private double unitPrice;
}
