package com.example.kolokwium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KolokwiumApplication {

	private final BankService bankService;
	private final ClientStorage clientStorage;
	private final ClientService clientService;
	public KolokwiumApplication(BankService bankService, ClientStorage clientStorage, ClientService clientService) {
		this.bankService = bankService;
		this.clientStorage = clientStorage;
		this.clientService = clientService;

		bankService.createRegistration( 1, clientStorage.getClientOfId(1), 200);
		bankService.createRegistration( 2, clientStorage.getClientOfId(2), 500);
		System.out.println("Rejestracje: " + bankService.getRegistrations());

		System.out.println("Klient o id = 0: " + clientStorage.getClientOfId(0));


	}

	public static void main(String[] args) {
		SpringApplication.run(KolokwiumApplication.class, args);
	}
}
