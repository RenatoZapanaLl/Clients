package com.example.ClientService.service;

import com.example.ClientService.model.Clients;
import com.example.ClientService.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
public class ServiceClientsImpl implements ServiceClients {

    @Autowired
    ClientsRepository repository;
    @Override
    public Flux<Clients> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Clients> findClientsByDNI(String DNI) {
        return repository.findAll().filter(x -> x.getDNI() == DNI);
    }

    @Override
    public Mono<Clients> save(Clients clients) {
        return repository.save(clients);
    }

    @Override
    public Mono<Clients> updateClients(Clients clients) {
        return repository.save(clients);
    }
}
