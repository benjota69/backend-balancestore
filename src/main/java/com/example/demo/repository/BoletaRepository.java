package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Boleta;

/**
 * Repositorio JPA para la entidad Boleta.
 */
public interface BoletaRepository extends JpaRepository<Boleta, Long> {
}


