package com.example.api.producto.repo;

import com.example.api.producto.modelo.CompraDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Compra extends MongoRepository<CompraDTO, Integer> {
}
