package com.example.kolokwium;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {
    private ClientStorage clientStorage;
    private RegistrationStorage registrationStorage;

    public BankService(ClientStorage clientStorage, RegistrationStorage registrationStorage) {
        this.clientStorage = clientStorage;
        this.registrationStorage = registrationStorage;

    }

    public void createRegistration(Integer idReg, Client client, Integer saldo){
        Registration registration = new Registration(idReg, client, saldo);

        registrationStorage.addRegistrationToList(registration);
    }

    public List<Registration> getAllRegistrations(){
        return registrationStorage.getRegistrationList();
    }

}
