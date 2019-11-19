package com.db1.db1start;

import java.util.List;

public abstract class Pessoas {

   private String nome;
   private String email;

   public Pessoas(String email, String nome){
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


