package com.db1.conta;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaTest {

    @Test
    public void deveRetornarContaPorConstrutor(){
        Conta conta = new Conta (1088, 500.00);
        Integer numeroConta = 1088;
        Double saldoAtual = 500.00;
        Assert.assertEquals(numeroConta, conta.getNumeroConta());
        Assert.assertEquals(saldoAtual, conta.getSaldoAtual());
    }

    @Test
    public void deveRetornarSaque(){

    }
}