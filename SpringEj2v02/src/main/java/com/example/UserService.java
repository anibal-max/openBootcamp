package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	
	NotificationService notificationService = new NotificationService();
	
	public UserService() {
		System.out.println("Constructor User Service");		
	}

	
}
