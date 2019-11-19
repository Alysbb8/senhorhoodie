package com.db1.db1start;

import java.util.ArrayList;
import java.util.Date;

public class App2 {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("maiko.cunha@db1.com.br", "Maiko Cunha");
        Aluno aluno2 = new Aluno("joao.silva@db1.com.br", "Joao Silva");
        Professor professor = new Professor("igor.silva@db1.com.br", "Igor Silva");


        Materia materia = new Materia();
        materia.nome = "Poo";
        materia.descricao = "Abstração,polimorfismo e herança";
        materia.cargaHora = 10.5;
        materia.professor = professor;


        Aula aula = new Aula();
        aula.data = new Date();
        aula.materia = materia;
        aula.listAlunos = new ArrayList<>();
        aula.listAlunos.add(aluno1);
        aula.listAlunos.add(aluno2);

        System.out.println(aula);

    }
}
