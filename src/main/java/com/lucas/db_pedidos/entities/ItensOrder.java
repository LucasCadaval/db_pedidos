package com.lucas.db_pedidos.entities;

import jakarta.persistence.*;

@Table(name = "itens_order")
@Entity
public class ItensOrder {

    @Id
    @JoinColumn(name = "itens_order_id")
    private ItensOrderId itensOrderId;

    private int quantity;

    @Column(name = "unit_price")
    private double unitPrice;
}
