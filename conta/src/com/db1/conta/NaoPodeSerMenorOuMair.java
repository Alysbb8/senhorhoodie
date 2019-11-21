package com.db1.conta;

public class NaoPodeSerMenorOuMair extends RuntimeException{

    public NaoPodeSerMenorOuMair(String frase){
        super(frase);
    }
}
