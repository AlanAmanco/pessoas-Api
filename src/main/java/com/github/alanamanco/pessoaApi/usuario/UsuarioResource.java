package com.github.alanamanco.pessoaApi.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    private final UsuarioRepository repository;

    public UsuarioResource(final UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<usuario> usuario() {
        return repository.findAll();
    }
}