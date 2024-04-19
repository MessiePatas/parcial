package com.example.api.producto.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document (collection = "productos")
public class Producto {

    @Id
    private Integer id;
    private String nombre;
    private String descripcion;
    private int stock;

}
