package com.example.api.usuarios.Controller;

import com.example.api.usuarios.modelo.Usuario;
import com.example.api.usuarios.repo.UsuarioR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioR usuarioR;

    @GetMapping("/listar")

    public List<Usuario> getAllUsuarios() {
        return usuarioR.findAll();
    }
}
