package com.github.alanamanco.pessoaApi.usuario;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class usuario {

    @Id
    private Long id;

    private String nome;

    public usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}