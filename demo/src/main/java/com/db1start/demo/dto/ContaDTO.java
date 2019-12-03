package com.db1start.demo.dto;

import com.db1start.demo.domain.entity.Agencia;

public class ContaDTO {

    private Long id;
    private Agencia agencia;
    private Double saldo;

    public Long getId() {
        return id;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }



}
