package com.db1.db1start;

import java.util.List;

public abstract class Pessoas {

   private String nome;
   private String email;

    public Pessoas(String email, String nome) {
        if(email == null){
            throw new CampoNaoPodeSerNulo("Email não pode ser nulo");
        }
        if(nome == null){
            throw new CampoNaoPodeSerNulo("Nome não pode ser nulo");
        }
        this.email = email;
        this.nome = nome;
    }



    public String getEmail(){
        return this.email;
   }

   public String getNome(){
        return this.nome;
   }



    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


