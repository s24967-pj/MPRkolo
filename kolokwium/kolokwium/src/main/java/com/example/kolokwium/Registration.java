package com.example.kolokwium;

public class Registration {
    private Integer registrationId;
    private Client client;
    private Integer saldo;

    public Registration(Integer registrationId, Client client, Integer saldo) {
        this.registrationId = registrationId;
        this.client = client;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Registration {" +
                "registrationId=" + registrationId +
                ", client=" + client +
                ", saldo=" + saldo +
                '}';
    }
}
