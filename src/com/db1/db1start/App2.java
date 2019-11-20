package com.db1.db1start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
public class App2 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(
                "maiko.cunha@db1.com.br",
                "Mike Cable");

        Aluno aluno2 = new Aluno(
                "joao.silva@db1.com.br",
                "Jo Silva");

        Professor professor = new Professor(
                "igor.silva@db1.com.br",
                "Igor Silva");

        Materia materia = new Materia(
                "fake",
                "aula",
                10.5,
                10,
                professor);

        List<Aluno> alunos = new ArrayList<>();
        alunos.addAll(Arrays.asList(aluno1, aluno2));
//        Aula aula = new Aula(new Date(), materia, alunos);

        //System.out.println(aula);

    }
}
