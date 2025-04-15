package com.lucas.db_pedidos.services;

import com.lucas.db_pedidos.entities.Client;
import com.lucas.db_pedidos.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService (ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client add(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Long id, Client client) {
        Optional<Client> clientOptional = clientRepository.findById(id);
        if(clientOptional.isPresent()) {
            Client clientToUpdate = clientOptional.get();

            clientToUpdate.setName(client.getName());
            clientToUpdate.setDateOfBirth(client.getDateOfBirth());
            clientToUpdate.setEmail(client.getEmail());
            clientToUpdate.setCep(client.getCep());
            clientToUpdate.setAddress(client.getCep());

            return clientRepository.save(clientToUpdate);
        }
        return null;
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}
