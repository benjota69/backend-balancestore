package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Producto;
import com.example.demo.service.ProductoService;

import lombok.RequiredArgsConstructor;
 
// Controlador REST para manejar los productos del catálogo.
@RestController
@RequestMapping("/api/productos")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @GetMapping
    public List<Producto> getAll() {
        return productoService.getAll();
    }

    @GetMapping("/{id}")
    public Producto getById(@PathVariable Long id) {
        return productoService.getById(id);
    }

    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.create(producto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> update(@PathVariable Long id, @RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.update(id, producto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}


