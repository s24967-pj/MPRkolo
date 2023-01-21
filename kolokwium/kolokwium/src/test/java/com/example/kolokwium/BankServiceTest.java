package com.example.kolokwium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@ExtendWith(MockitoExtension.class)

public class BankServiceTest {

    @Mock
    private RegistrationStorage registrationStorage;

    //tu se mokujesz te rzeczy z klasy nizej
    @Mock
    private ClientStorage clientStorage;

    //tu se klase mokujesz kukielkujesz
    @InjectMocks
    private BankService bankService;

    @Test
    public void createRegistrationNotEmpty(){
        Client client = new Client(0,"Basia");
        Registration registration = new Registration(0, client, 200);

        Mockito.when(bankService.getAllRegistrations()).thenReturn(List.of(registration));
        assertThat(bankService.getAllRegistrations()).isNotEmpty();


    }
}
