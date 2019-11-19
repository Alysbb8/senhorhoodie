package com.db1.db1start;

import java.util.List;

public class Materia {
  public   String nome;
  public   String descricao;
  public   Double cargaHora;
  public   Integer quantiAulas;
  public   Professor professor;


  public Materia(String nome, String descricao, Double cargaHora, Integer quantiAulas, Professor professor){

    this.nome = nome;
    this.descricao = descricao;
    this.cargaHora = cargaHora;
    this.quantiAulas = quantiAulas;
    this.professor = professor;

  }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHora=" + cargaHora +
                ", quantiAulas=" + quantiAulas +
                ", professor=" + professor +
                '}';
    }
}
