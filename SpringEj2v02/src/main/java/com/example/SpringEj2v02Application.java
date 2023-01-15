package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringEj2v02Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringEj2v02Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//El nombre del Bean empieza siempre con minuscula por convencion, sin importar que la clase empiece en mayuscula
		UserService userService = (UserService) context.getBean("userService");
		
		userService.notificationService.imprimirSaludo();
		
		
	}

}
