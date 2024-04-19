package com.example.api.producto.logica;

import com.example.api.producto.modelo.CompraDTO;
import com.example.api.producto.modelo.Producto;
import com.example.api.producto.repo.Compra;
import com.example.api.producto.repo.ProductoR;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class LogicaProducto {

    @Autowired
    private ProductoR productoR;

    @Autowired
    private Compra compra;

    public void realizarCompra(List<CompraDTO> compras) {
        for (CompraDTO compra : compras) {
            // Obtén el producto de la base de datos usando el id
            Producto producto = productoR.findById(compra.getIdProducto()).orElse(null);

            if (producto == null) {
                throw new IllegalArgumentException("El producto con id " + compra.getIdProducto() + " no existe.");
            }

            if (producto.getStock() < compra.getCantidad()) {
                throw new IllegalArgumentException("Stock insuficiente para realizar la compra.");
            }

            producto.setStock(producto.getStock() - compra.getCantidad());

            // Guarda el producto actualizado en la base de datos
            productoR.save(producto);
        }
    }
}





