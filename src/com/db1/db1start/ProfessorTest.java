package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfessorTest {

    @Test
    public void deveCriarProfessorPorConstrutor(){
        Professor professor = new Professor(
                "email.fake@email.com",
                "fake");
        String email =
                "email.fake@email.com";
        String nome =
                "fake";
        Assert.assertEquals(email, professor.getEmail());
        Assert.assertEquals(nome, professor.getNome());
    }

    @Test
    public void deveJogarOExceptionComDescricaoNulo(){
        String nome = "fake";

        try {
            Professor professor = new Professor(null, nome);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Email não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

    @Test
    public void deveJogarOExceptionComNomeNulo(){
        String email = "blablabla@gmail.com";

        try {
            Professor professor = new Professor(email, null );
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
            Assert.assertEquals("Nome não pode ser nulo", naoPodeSerNulo
                    .getMessage());
        }
    }

}