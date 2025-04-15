package com.lucas.db_pedidos.services;

import com.lucas.db_pedidos.entities.Order;
import com.lucas.db_pedidos.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService (OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order getById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order add(Order order) {
        return orderRepository.save(order);
    }

    public Order update(Long id, Order order) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        if(orderOptional.isPresent()) {
            Order orderToUpdate = orderOptional.get();

            orderToUpdate.setClient(order.getClient());
            orderToUpdate.setCreatedAt(order.getCreatedAt());
            orderToUpdate.setTotalValue(order.getTotalValue());

            return orderRepository.save(orderToUpdate);
        }
        return null;
    }

    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
