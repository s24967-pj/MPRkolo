package com.example.kolokwium;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RegistrationStorage {
    private List<Registration> registrationList = new ArrayList<>();

    public List<Registration> getRegistrationList() {
        return registrationList;
    }

    public void addRegistrationToList(Registration rregistration){
        registrationList.add(rregistration);
    }
}
