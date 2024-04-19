package com.example.api.producto.repo;

import com.example.api.producto.modelo.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoR extends MongoRepository<Producto, Integer>{}

