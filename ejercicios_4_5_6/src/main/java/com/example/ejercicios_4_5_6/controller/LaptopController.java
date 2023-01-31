package com.example.ejercicios_4_5_6.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicios_4_5_6.domain.Laptop;
import com.example.ejercicios_4_5_6.repository.LaptopRepository;


@RestController
public class LaptopController {
	
	private LaptopRepository laptopRepository;

	
	public LaptopController(LaptopRepository laptopRepository) {
		this.laptopRepository = laptopRepository;
	}
	
	@GetMapping("/api/laptops")
	public List<Laptop> findAll(){
		return laptopRepository.findAll();
	}
	
	@PostMapping("/api/laptops/add")
	public void save(Laptop laptop) {
		laptopRepository.save(laptop);
	}
	
}
