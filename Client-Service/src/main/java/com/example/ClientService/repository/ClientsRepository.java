package com.example.ClientService.repository;

import com.example.ClientService.model.Clients;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends ReactiveMongoRepository<Clients,String> {
}
