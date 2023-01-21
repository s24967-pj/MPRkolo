package com.example.kolokwium;

public class Client {
    private Integer clientId;
    private String name;

    public Client(Integer clientId, String name) {
        this.clientId = clientId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getClientId() {
        return clientId;
    }
}
