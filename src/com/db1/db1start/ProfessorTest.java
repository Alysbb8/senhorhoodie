package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfessorTest {

    @Test
    public void deveCriarProfessorPorConstrutor(){
        Professor professor = new Professor("email.fake@email.com", "fake");
        String email = "email.fake@email.com";
        String nome = "fake";
        Assert.assertEquals(email, professor.getEmail());
        Assert.assertEquals(nome, professor.getNome());
    }

}