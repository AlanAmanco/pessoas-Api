package com.github.alanamanco.pessoaApi.pessoas;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoa")
public class PessoaResource {

    private final PessoaRepository repository;

    public PessoaResource(final PessoaRepository repository) {
        this.repository = repository;
    }

    // 2nd - Pageable
    @GetMapping
    public Page<Pessoa> pessoas(final Pageable page) {
        return repository.findAll(page);
    }

}