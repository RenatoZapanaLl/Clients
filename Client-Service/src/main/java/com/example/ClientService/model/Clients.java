package com.example.ClientService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Clients")
public class Clients {
    @Id
    private  String id;
    private  String NamesClients;
    private  String DNI;
    private  String NumberPhone;
}
