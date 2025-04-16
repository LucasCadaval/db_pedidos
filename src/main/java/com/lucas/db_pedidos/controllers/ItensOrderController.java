package com.lucas.db_pedidos.controllers;

import com.lucas.db_pedidos.entities.ItensOrder;
import com.lucas.db_pedidos.entities.Order;
import com.lucas.db_pedidos.services.ItensOrderService;
import com.lucas.db_pedidos.services.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itensOrder")
public class ItensOrderController {

    private final ItensOrderService itensOrderService;

    public ItensOrderController (ItensOrderService itensOrderService) {
        this.itensOrderService = itensOrderService;
    }

    @GetMapping("/get")
    public List<ItensOrder> getAll() {
        return itensOrderService.getAll();
    }

    @GetMapping("/get/{id}")
    public ItensOrder getById(@PathVariable Long id) {
        return itensOrderService.getById(id);
    }

    @PostMapping("/add")
    public ItensOrder add(@RequestBody ItensOrder itensOrder) {
        return itensOrderService.add(itensOrder);
    }

    @PutMapping("/update/{id}")
    public ItensOrder update(@PathVariable Long id, @RequestBody ItensOrder itensOrder) {
        return itensOrderService.update(id, itensOrder);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        itensOrderService.delete(id);
    }
}
