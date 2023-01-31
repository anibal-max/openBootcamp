package com.example.ejercicios_4_5_6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicios_4_5_6.domain.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
