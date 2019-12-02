package com.db1.conta;

import java.util.zip.DeflaterOutputStream;

public class Conta {


    public Integer numeroConta;

    public Double saldoAtual;
    public Conta( Integer numeroConta, Double saldoAtual) {

        this.numeroConta = numeroConta;
        this.saldoAtual = saldoAtual;

    }

    public void deposito(Double deposito){

        this.saldoAtual = this.saldoAtual + deposito;
    }

    public void saque(Double saque){
        if(saldoAtual < saque){
            throw new NaoPodeSerMenorOuMair("Não há dinheiro na conta");
        }
        this.saldoAtual = this.saldoAtual - saque;
    }


    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", saldoAtual=" + saldoAtual +
                '}';
    }


}
