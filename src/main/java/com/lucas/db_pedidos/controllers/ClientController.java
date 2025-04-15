package com.lucas.db_pedidos.controllers;

import com.lucas.db_pedidos.entities.Client;
import com.lucas.db_pedidos.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController (ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/get")
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/get/{id}")
    public Client getById(@PathVariable Long id) {
        return clientService.getById(id);
    }

    @PostMapping("/add")
    public Client add(@RequestBody Client client) {
        return clientService.add(client);
    }

    @PutMapping("/update/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client) {
        return clientService.update(id, client);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }
}

