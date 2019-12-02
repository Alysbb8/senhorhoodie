package com.db1.conta;

public class Transacao  {
    public Double valorTransf;
    public Double valorSaq;
    public Double valorDeposito;
    public Double saldoFinal;

    public Transacao (Double valorTransf, Double valorSaq, Double valorDeposito, Double saldoFinal) {
        this.saldoFinal = saldoFinal;
        this.valorTransf = valorTransf;
        this.valorSaq = valorSaq;
        this.valorDeposito = valorDeposito;
    }


    @Override
    public String toString() {
        return "Transacao{" +
                "valorTransf=" + valorTransf +
                ", valorSaq=" + valorSaq +
                ", valorDeposito=" + valorDeposito +
                ", saldoFinal=" + saldoFinal +
                '}';
    }

}
