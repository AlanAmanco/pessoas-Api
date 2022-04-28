package com.github.alanamanco.pessoaApi.pessoas;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
    public class Pessoa {

        @Id
        private Long id;

        private String nome;

        private String sexo;

        private Integer eMail;

        private Date dataNascimeto;

        private String naturalidade;

        private String nacionalidade;

        private String cpf;


        public Pessoa() {
        }

    public Pessoa(Long id,
                  String nome,
                  String sexo,
                  Integer eMail,
                  Date dataNascimeto,
                  String naturalidade,
                  String nacionalidade,
                  String cpf) {

        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.eMail = eMail;
        this.dataNascimeto = dataNascimeto;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer geteMail() {
        return eMail;
    }

    public void seteMail(Integer eMail) {
        this.eMail = eMail;
    }

    public Date getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(Date dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

