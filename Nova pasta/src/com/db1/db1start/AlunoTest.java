package com.db1.db1start;

import com.sun.org.apache.bcel.internal.generic.ALOAD;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class AlunoTest {

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        Aluno aluno = new Aluno(
                "email.fake@email.com",
                "fake");
        String email =
                "email.fake@email.com";
        String nome =
                "fake";
        Assert.assertEquals(email, aluno.getEmail());
        Assert.assertEquals(nome, aluno.getNome());
    }

    @Test
    public void deveJogarOExceptionComEmailNulo(){
        String nome = "fake";
        try {
            Aluno aluno = new Aluno(null, nome);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }


    @Test
    public void deveJogarOExceptionComNomeNulo(){
        String email = "fake@email.com";
        try {
            Aluno aluno = new Aluno(email, "null" );
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

    @Test
    public void deveAdicionarAlunosNaChamada(){
        String email = "email.fake@email.com";
        String nome = "Fake";
        Date data = new Date();
        Professor professor = new Professor("aluno@emial.com", "aluno");
        Materia materia = new Materia("aluno", "Poo", 10.5, 10,
                professor);
        Aula aula = new Aula(data, materia);
        Assert.assertEquals(0,aula.getListAlunos().size());

        Aluno aluno = new Aluno(email, nome);
        aula.darPresenca(aluno);

        Assert.assertEquals(1, aula.quantidadeDeAlunosPresentes());

    }
}