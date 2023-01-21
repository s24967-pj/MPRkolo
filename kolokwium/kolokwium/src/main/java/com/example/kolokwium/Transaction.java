package com.example.kolokwium;

public class Transaction {
    private ClientStorage clientStorage;
    RegistrationStorage registrationStorage;

    private Status status;

    public Transaction(ClientStorage clientStorage, RegistrationStorage registrationStorage) {
        this.clientStorage = clientStorage;
        this.registrationStorage = registrationStorage;
    }

    public void nTransaction(Integer kwota, Registration registration, Status status){
       // Transaction Transaction = new Transaction(kwota,registration, status);

    }

    public enum Status{
        Accepted,
        Declined;
    }
}
