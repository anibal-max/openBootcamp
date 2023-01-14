package com.example.ejercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ej1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ej1Application.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludo saludo = (Saludo) context.getBean("Saludo");
		
		saludo.imprimirSaludo();
		
	}

}
