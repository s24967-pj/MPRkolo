package com.example.kolokwium;

public class Transaction {
    private ClientStorage clientStorage;
    RegistrationStorage registrationStorage;

    private Status status;
    public Transaction(ClientStorage clientStorage, RegistrationStorage registrationStorage) {
        this.clientStorage = clientStorage;
        this.registrationStorage = registrationStorage;
    }

    public void newTransaction(){
        Transaction transaction = new Transaction();

    }

    public enum Status{
        Accepted,
        Declined;
    }
}
