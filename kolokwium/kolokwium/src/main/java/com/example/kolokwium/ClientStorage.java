package com.example.kolokwium;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private List<Client> clientList = new ArrayList<>();

    public void addClientToList(Client client){
        clientList.add(client);
    }

    public List<Client> getAllClients(){
        return clientList;
    }

    public Client getClientOfId(Integer idClient){
        for (Client client : clientList) {
            Integer clientId = client.getClientId();

            if(clientId == idClient){
                return client;
            }
        }
        return null;
    }
}
