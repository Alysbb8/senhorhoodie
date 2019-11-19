package com.db1.db1start;

import java.util.Date;
import java.util.List;

public class Aula {
   public Date data;
   public Materia materia;
   public List<Aluno> listAlunos;

    @Override
    public String toString() {
        return "Aula{" +
                "data=" + data +
                ", materia=" + materia +
                ", listAlunos=" + listAlunos +
                '}';
    }
}
