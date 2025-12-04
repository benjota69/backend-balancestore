package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Producto;
import com.example.demo.repository.ProductoRepository;
 
import lombok.RequiredArgsConstructor;
 
// Servicio con operaciones básicas para productos.
@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    public Producto getById(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto update(Long id, Producto producto) {
        Producto db = getById(id);
        db.setNombre(producto.getNombre());
        db.setDescripcion(producto.getDescripcion());
        db.setPrecio(producto.getPrecio());
        db.setPrecioFinal(producto.getPrecioFinal());
        db.setDescuento(producto.getDescuento());
        db.setImagen(producto.getImagen());
        db.setCategoria(producto.getCategoria());
        db.setStock(producto.getStock());
        return productoRepository.save(db);
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }
}


