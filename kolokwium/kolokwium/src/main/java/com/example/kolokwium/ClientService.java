package com.example.kolokwium;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientService {
    private ClientStorage clientStorage;
    private Integer idClient = 0;

    public ClientService(ClientStorage clientStorage) {
        this.clientStorage = clientStorage;

        populateClients();
    }

    public Client createClient(String name){
        Client client = new Client(idClient++, name);

        clientStorage.addClientToList(client);

        return client;
    }
    private void populateClients(){
        createClient("Karol");
        createClient("Monke");
        createClient("Monkers");

    }


}
