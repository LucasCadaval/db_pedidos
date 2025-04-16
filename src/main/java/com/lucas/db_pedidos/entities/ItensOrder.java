package com.lucas.db_pedidos.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "itens_order")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItensOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;

    private int quantity;

    @Column(name = "unit_price")
    private double unitPrice;
}
