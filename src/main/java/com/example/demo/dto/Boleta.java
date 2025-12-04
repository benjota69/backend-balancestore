package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// Entidad JPA para guardar una boleta generada en el checkout.
@Entity
@Table(name = "boletas")
@Data
public class Boleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String folio;

    private String nombreCompleto;

    private String email;

    private String metodoPago;

    private Double total;

    @Column(length = 8000)
    private String productosJson;
}


