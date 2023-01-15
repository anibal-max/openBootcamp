package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	public NotificationService() {
		System.out.println("Constructor Notification Service");
	}
	public void imprimirSaludo() {
		System.out.println("Saludo Notification Service");
	}
}
