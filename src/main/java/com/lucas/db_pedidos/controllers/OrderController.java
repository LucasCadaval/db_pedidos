package com.lucas.db_pedidos.controllers;

import com.lucas.db_pedidos.entities.Order;
import com.lucas.db_pedidos.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController (OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/get")
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/get/{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getById(id);
    }

    @PostMapping("/add")
    public Order add(@RequestBody Order order) {
        return orderService.add(order);
    }

    @PutMapping("/update/{id}")
    public Order update(@PathVariable Long id, @RequestBody Order order) {
        return orderService.update(id, order);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        orderService.delete(id);
    }
}
