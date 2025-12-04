package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Producto;

/**
 * Repositorio JPA para la entidad Producto.
 */
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}


