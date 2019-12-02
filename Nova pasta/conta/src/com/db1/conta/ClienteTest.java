package com.db1.conta;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.XmlAnyAttribute;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void deveRetornarPorMeioDoConstrutor(){
        Cliente cliente = new Cliente(
                "pika",
                23,
                "treinador",
                "Feminino",
                "Pallet",
                "102",
                8000.00);
        String nome = "pika";
        Integer idade = 23;
        String trabalho = "treinador";
        String sexo = "Feminino";
        String endereco = "Pallet";
        String cpf = "102";
        Double saldo = 8000.00;
        Assert.assertEquals(nome, cliente.getNome());
        Assert.assertEquals(idade, cliente.getIdade());
        Assert.assertEquals(trabalho, cliente.getTrabalho());
        Assert.assertEquals(sexo, cliente.getSexo());
        Assert.assertEquals(endereco, cliente.getEndereco());
        Assert.assertEquals(cpf, cliente.getCpf());
        Assert.assertEquals(saldo, cliente.getSaldo());
    }



}