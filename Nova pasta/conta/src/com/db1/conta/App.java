package com.db1.conta;

import org.omg.CORBA.TRANSACTION_MODE;

public class App {


    public static void main(String[] args) {


        Cliente cliente = new Cliente("Rodolfo",
                22,
                "Programador",
                "Masculino",
                "Rua Joaquim Santos",
                "107.939.080-43",
                99999.00);


        Conta conta = new Conta (
                1828798-448,
                99999.00);

        Conta conta2 = new Conta (
                18288-448,
                999.00);


        Transacao transacao = new Transacao(
                0.00,
                500.00,
                0.00,
                0.00);

        conta.saque (10000.00);
        conta2.deposito(500.00);

        System.out.println(cliente);
        System.out.println(conta2);
        System.out.println(conta);
        System.out.println(transacao);
    }

}
