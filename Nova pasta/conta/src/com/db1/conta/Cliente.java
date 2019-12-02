package com.db1.conta;



public class Cliente {

    public String nome;

    public Integer idade;
    public String trabalho;
    public String sexo;
    public String endereco;
    public String cpf;
    public Double saldo;


    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente(String nome, Integer idade, String trabalho, String sexo, String endereco, String cpf, Double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.trabalho = trabalho;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cpf = cpf;
        this.saldo = saldo;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", trabalho='" + trabalho + '\'' +
                ", sexo='" + sexo + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
