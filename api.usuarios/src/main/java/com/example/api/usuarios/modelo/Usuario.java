package com.example.api.usuarios.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "usuarios")
public class Usuario {

        @Id
        private Integer id;
        private String nombre;
        private String apellido;
        private String password;
        private boolean admin;

}
