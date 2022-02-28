package com.example.ClientService.controller;

import com.example.ClientService.model.Clients;
import com.example.ClientService.service.ServiceClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
@RequestMapping("/api")
public class ControllerClients {

    @Autowired
    ServiceClients service;

    @GetMapping("/getClients")
    public Flux<Clients> getDeposit() {
        return service.findAll();
    }

    @GetMapping("/getClientsByDNI")
    public Flux<Clients> findDepositsByDNI(@PathVariable("dni") String dni) {

        return service.findClientsByDNI(dni);
    }
    @PostMapping("/postClients")
    Mono<Clients> postDeposit(@RequestBody Clients clients) {
        return service.save(clients);
    }

    @PostMapping("/updClients")
    Mono<Clients> updCustomers (@RequestBody Clients clients)
    {
        return service.updateClients(clients);
    }

}
