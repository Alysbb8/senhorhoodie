package com.db1.db1start;

import com.sun.org.apache.bcel.internal.generic.ALOAD;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlunoTest {

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor(){
        Aluno aluno = new Aluno("email.fake@email.com", "fake");
        String email = "email.fake@email.com";
        String nome = "fake";
        Assert.assertEquals(email, aluno.getEmail());
        Assert.assertEquals(nome, aluno.getNome());
    }
}