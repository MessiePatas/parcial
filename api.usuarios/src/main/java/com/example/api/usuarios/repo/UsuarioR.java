package com.example.api.usuarios.repo;

import com.example.api.usuarios.modelo.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioR extends MongoRepository<Usuario, Integer>{
}
