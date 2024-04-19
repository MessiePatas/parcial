package com.example.api.producto.modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document (collection = "Cantidad")
public class CompraDTO {

    @Id
    private Integer idProducto;
    private int cantidad;
}
