package com.example.demo.dto;
 
// DTO simple para la petición de login (usuario/correo + contraseña).
public record LoginRequest(
        String identifier,
        String password
) {
}


