package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Boleta;
import com.example.demo.service.BoletaService;
 
import lombok.RequiredArgsConstructor;
 
// Controlador REST para guardar y listar boletas (compras).
@RestController
@RequestMapping("/api/boletas")
@CrossOrigin("*")
@RequiredArgsConstructor
public class BoletaController {

    private final BoletaService boletaService;

    @PostMapping
    public ResponseEntity<Boleta> crear(@RequestBody Boleta boleta) {
        if (boleta.getFolio() == null || boleta.getFolio().isBlank()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        Boleta creada = boletaService.crear(boleta);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @GetMapping
    public List<Boleta> listar() {
        return boletaService.getAll();
    }
}


