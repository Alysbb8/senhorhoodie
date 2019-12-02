package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;



public class MateriaTest {

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        Professor professor = new Professor(
                "profesor@email.com",
                "fake");
        Materia materia = new Materia(
                "fake",
                "aula",
                10.5,
                10,
                professor);
        String nome = "fake";
        String descricao = "aula";
        Double cargaHora = 10.5;
        Integer quantiAulas = 10;
        Assert.assertEquals(nome, materia.getNome());
        Assert.assertEquals(descricao, materia.getDescricao());
        Assert.assertEquals(cargaHora, materia.getCargaHora());
        Assert.assertEquals(quantiAulas, materia.getQuantiAulas());
    }

    @Test
    public void deveJogarOExceptionComDescricaoNulo(){
        String nome = "fake";
        Double cagaHora = 10.5;
        Integer quantiAulas = 10;

        try {
            Materia materia = new Materia(nome, null, cagaHora, quantiAulas,
                    new Professor("bno@email.com", "fakerson"));
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("descricao não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

    @Test
    public void deveJogarOExceptionComNomeNulo(){
        String descricao = "blabla";
        Double cagaHora = 10.5;
        Integer quantiAulas = 10;

        try {
            Materia materia = new Materia(null, descricao, cagaHora, quantiAulas,
                    new Professor("bno@email.com", "fakerson"));
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

    @Test
    public void deveJogarOExceptionComCaraHoraNulo(){
        String nome = "fake";
        String descricao = "bla bla";
        Integer quantiAulas = 10;

        try {
            Materia materia = new Materia(nome, descricao, null, quantiAulas,
                    new Professor("bno@email.com", "fakerson"));
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Carga Horária não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

    @Test
    public void deveJogarOExceptionComQuantAulasNulo(){
        String nome = "fake";
        String descricao = "bla bla";
        Double cagaHora = 10.5;

        try {
            Materia materia = new Materia(nome,descricao, cagaHora, null,
                    new Professor("bno@email.com", "fakerson"));
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Quantidade de aulas não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

    @Test
    public void deveJogarOExceptionCompProfessorNulo(){
        String nome = "fake";
        String descricao = "bla bla";
        Double cagaHora = 10.5;
        Integer quantiAulas = 10;

        try {
            Materia materia = new Materia(nome, descricao, cagaHora, quantiAulas,
                    null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Professor não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

}