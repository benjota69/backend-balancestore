package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
 
// Entidad JPA para los productos del catálogo.
@Entity
@Table(name = "productos")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre visible en el catálogo
    private String nombre;

    // Descripción corta o larga del producto
    // Aumentamos el tamaño porque algunas descripciones son bien largas
    @Column(length = 2000)
    private String descripcion;

    // Precio normal sin descuentos
    private Double precio;

    // Precio final luego del descuento (si aplica)
    private Double precioFinal;

    // Porcentaje de descuento (ej: 20 para 20%)
    private Integer descuento;

    // URL de la imagen del producto
    private String imagen;

    // Categoría simple (audio, periféricos, etc.)
    private String categoria;

    // Cantidad disponible en stock
    private Integer stock;
}


