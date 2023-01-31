package com.example.ejercicios_4_5_6.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptops")
public class Laptop {
	
	@Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Marca;
	private String Modelo;
	private Double Precio;
	
	
	
	public Laptop() {		
	}



	public Laptop(Long id, String marca, String modelo, Double precio) {		
		this.id = id;
		Marca = marca;
		Modelo = modelo;
		Precio = precio;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public Double getPrecio() {
		return Precio;
	}



	public void setPrecio(Double precio) {
		Precio = precio;
	}
	
	
}
