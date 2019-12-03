package com.db1start.demo.dto;

import com.db1start.demo.domain.entity.Estado;

public class CidadeDTO {

    private String nome;
    private String nomeEstado;


    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
