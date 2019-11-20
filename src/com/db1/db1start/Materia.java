package com.db1.db1start;

import java.util.List;

public class Materia {
  private   String nome;

  private   String descricao;
  private   Double cargaHora;
  private   Integer quantiAulas;
  private   Professor professor;



  public Materia(String nome,
                 String descricao,
                 Double cargaHora,
                 Integer quantiAulas,
                 Professor professor){

    if(descricao == null){
      throw new CampoNaoPodeSerNulo("descricao não pode ser nulo");
    }
    if(cargaHora == null){
      throw new CampoNaoPodeSerNulo("Carga Horária não pode ser nulo");
    }
    if (quantiAulas == null){
      throw new CampoNaoPodeSerNulo("Quantidade de aulas não pode ser nulo");
    }
    if(professor == null){
      throw new CampoNaoPodeSerNulo("Professor não pode ser nulo");
    }



    this.nome = nome;
    this.descricao = descricao;
    this.cargaHora = cargaHora;
    this.quantiAulas = quantiAulas;
    this.professor = professor;

  }

  public void trocaProfessor(Professor professorNovo){
      if(professor == null){
        throw new CampoNaoPodeSerNulo("Professor não pode ser nulo");
      }
        professor = professorNovo;
  }





  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public Double getCargaHora() {
    return cargaHora;
  }

  public Integer getQuantiAulas() {
    return quantiAulas;
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
