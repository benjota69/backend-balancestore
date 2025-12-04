package com.example.demo.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
 
// Entidad JPA para los usuarios del sistema.
@Entity
@Data
@Table(name = "usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre de usuario único
    @NotBlank(message = "El nombre de usuario no puede estar vacío")
    @Column(unique = true)
    private String username;

    // Nombre completo de la persona
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name; // nombre completo

    @Email(message = "Debe ser un correo válido")
    private String email;

    @NotBlank(message = "La contraseña no puede estar vacía")
    private String password;
    
}

