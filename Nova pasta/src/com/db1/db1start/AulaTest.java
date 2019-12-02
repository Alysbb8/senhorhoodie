//package com.db1.db1start;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import javax.xml.crypto.Data;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class AulaTest {
//
//    @Test
//    public void deveCriarAulaPorConstrutor(){
//        Aluno aluno1 = new Aluno("aly@email.com", "aly");
//        Aluno aluno2 = new Aluno("aluno@email.com", "aluno");
//        Date data = new Date();
//        List<Aluno> alunos = new ArrayList<>();
//        Materia materia = new Materia("aly", "blabla", 10.5, 10,
//                new Professor("Igor.silva@db1.com", "Igor Silva"));
//        alunos.addAll(Arrays.asList(aluno1, aluno2));
////        Aula aula = new Aula(data ,materia, alunos);
//        Assert.assertEquals(data, aula.getData());
//        Assert.assertEquals(materia, aula.getMateria());
//        Assert.assertEquals(alunos, aula.getListAlunos());
//    }
//
////    @Test
////    public void deveJogarOExceptionComDataNulo(){
////
////        try {
////            Aula aula = new Aula(null, new Materia("aly", "blabla", 10.5, 10,
////                    new Professor("igor@email.com", "Igor")), new ArrayList<>());
////        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
////            Assert.assertEquals("Data não pode ser nulo", naoPodeSerNulo
////                    .getMessage());
////        }
////    }
//
////    @Test
////    public void deveJogarOExceptionComMateriaNulo(){
////
////        try {
////            Aula aula = new Aula(new Date(),null, new ArrayList<>());
////        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
////            Assert.assertEquals("Materia não pode ser nulo", naoPodeSerNulo
////                    .getMessage());
////        }
////    }
////
////    @Test
////    public void deveJogarOExceptionComListaAlunosNulo(){
////
////        try {
////            Aula aula = new Aula(new Date(), new Materia("aly", "blabla", 10.5, 10,
////                    new Professor("igor@email.com", "Igor")),null);
////        } catch (CampoNaoPodeSerNulo naoPodeSerNulo){
////            Assert.assertEquals("lista de alunos não pode ser nulo", naoPodeSerNulo
////                    .getMessage());
////        }
////    }
//
//
//
//
//
//}