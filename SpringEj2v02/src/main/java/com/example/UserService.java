package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	
	NotificationService notificationService;
	
	public UserService(NotificationService notificationService) {
		System.out.println("Constructor User Service");
		this.notificationService = notificationService;
	}

	
}
