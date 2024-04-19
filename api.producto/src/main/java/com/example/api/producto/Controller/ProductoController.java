package com.example.api.producto.Controller;

import com.example.api.producto.logica.LogicaProducto;
import com.example.api.producto.modelo.CompraDTO;
import com.example.api.producto.modelo.Producto;
import com.example.api.producto.repo.ProductoR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoR productoR;

    @Autowired
    private LogicaProducto logicaProducto;

    @GetMapping("/listar")
    public List<Producto> getAllProductos() {
        return productoR.findAll();
    }

    @PostMapping("/agregar")
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoR.save(producto);
    }

    @PostMapping("/compra")
    public void realizarCompra(@RequestBody List<CompraDTO> compras) {
        logicaProducto.realizarCompra(compras);
    }


}