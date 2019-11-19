package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.;

public class MateriaTest {

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        Materia materia = new materia("email.fake@email.com", "fake");
        String email = "email.fake@email.com";
        String nome = "fake";
        Assert.assertEquals(email, aluno.getEmail());
        Assert.assertEquals(nome, aluno.getNome());
    }

}