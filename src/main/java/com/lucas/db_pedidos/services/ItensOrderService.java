package com.lucas.db_pedidos.services;

import com.lucas.db_pedidos.entities.ItensOrder;
import com.lucas.db_pedidos.repositories.ItensOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItensOrderService {

    private final ItensOrderRepository itensOrderRepository;

    public ItensOrderService (ItensOrderRepository itensOrderRepository) {
        this.itensOrderRepository = itensOrderRepository;
    }

    public List<ItensOrder> getAll() {
        return itensOrderRepository.findAll();
    }

    public ItensOrder getById(Long id) {
        return itensOrderRepository.findById(id).orElse(null);
    }

    public ItensOrder add(ItensOrder itensOrder) {
        return itensOrderRepository.save(itensOrder);
    }

    public ItensOrder update(Long id, ItensOrder itensOrder) {
        Optional<ItensOrder> itensOrderOptional = itensOrderRepository.findById(id);
        if(itensOrderOptional.isPresent()) {
            ItensOrder itensOrderToUpdate = itensOrderOptional.get();

            itensOrderToUpdate.setOrder(itensOrder.getOrder());
            itensOrderToUpdate.setProduct(itensOrder.getProduct());
            itensOrderToUpdate.setQuantity(itensOrder.getQuantity());
            itensOrderToUpdate.setUnitPrice(itensOrder.getUnitPrice());

            return itensOrderRepository.save(itensOrderToUpdate);
        }
        return null;
    }

    public void delete(Long id) {
        itensOrderRepository.deleteById(id);
    }
}
