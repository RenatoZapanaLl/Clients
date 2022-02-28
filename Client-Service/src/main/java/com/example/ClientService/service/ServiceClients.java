package com.example.ClientService.service;

import com.example.ClientService.model.Clients;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceClients {

    Flux<Clients> findAll();

    Flux<Clients> findClientsByDNI(String DNI);

    Mono<Clients> save(Clients clients);

    Mono<Clients> updateClients(Clients clients);

}
