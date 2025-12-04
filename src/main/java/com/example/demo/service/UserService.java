package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.User;
import com.example.demo.repository.UserRepository;
 
import lombok.RequiredArgsConstructor;
 
// Servicio con la lógica de usuarios (registro, login y CRUD).
@Service
@RequiredArgsConstructor
public class UserService {

    // Repositorio de usuarios
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User user) {
        User dbUser = getById(id);
        dbUser.setUsername(user.getUsername());
        dbUser.setName(user.getName());
        dbUser.setEmail(user.getEmail());
        dbUser.setPassword(user.getPassword());
        return userRepository.save(dbUser);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    // Registrar usuario nuevo si no existe otro con mismo usuario/correo
    public User register(User user) {
        userRepository.findByUsernameOrEmail(user.getUsername(), user.getEmail())
                .ifPresent(u -> {
                    throw new RuntimeException("Ya existe un usuario con ese nombre o correo");
                });
        return userRepository.save(user);
    }

    // Login usando username o correo más la contraseña
    public User login(String identifier, String password) {
        User user = userRepository.findByUsernameOrEmail(identifier, identifier)
                .orElseThrow(() -> new RuntimeException("Usuario o correo no encontrado"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        return user;
    }
}
