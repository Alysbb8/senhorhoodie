package com.db1.db1start;

public class Aluno extends Pessoas{

   public Double nota;

   public Aluno(String email, String nome){

       super(email, nome);
   }

    @Override
    public String toString() {
        return super.toString() + "Aluno{" +
                "nota=" + nota +
                '}';
    }
}
