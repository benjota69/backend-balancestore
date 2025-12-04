package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Boleta;
import com.example.demo.repository.BoletaRepository;
 
import lombok.RequiredArgsConstructor;
 
// Servicio sencillo para crear y listar boletas.
@Service
@RequiredArgsConstructor
public class BoletaService {

    private final BoletaRepository boletaRepository;

    public Boleta crear(Boleta boleta) {
        return boletaRepository.save(boleta);
    }

    public List<Boleta> getAll() {
        return boletaRepository.findAll();
    }
}


