package com.db1.db1start;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {


    private Date data;
    private Materia materia;
    private List<Aluno> listAlunos = new ArrayList<>();


    public void darPresenca(Aluno aluno){
        if(listAlunos == null){
            throw new CampoNaoPodeSerNulo("Aluno não pode ser nulo.");
        }
        this.listAlunos.add(aluno);
    }

    public int quantidadeDeAlunosPresentes(){
        return this.listAlunos.size();
    }

    public Aula(Date data,
                Materia materia
                ){

        if(data == null){
            throw new CampoNaoPodeSerNulo("Data não pode ser nulo");
        }
        if(materia == null){
            throw new CampoNaoPodeSerNulo("Materia não pode ser nulo");
        }
        if(listAlunos == null){
            throw new CampoNaoPodeSerNulo("lista de alunos não pode ser nulo");
        }

        this.data = data;
        this.materia = materia;
        this.listAlunos = listAlunos;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "data=" + data +
                ", materia=" + materia +
                ", listAlunos=" + listAlunos +
                '}';
    }

    public Date getData() {
        return data;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getListAlunos() {
        return listAlunos;
    }
}
