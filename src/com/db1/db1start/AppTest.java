package com.db1.db1start;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    //integer
    @Test
    public void deveRetornar5() {

        Application application = new Application();
            Integer expected = 10;
            Integer response = application.soma(2,8);
        Assert.assertEquals(expected,response);


    }
    @Test
    public void deveSubtrair2numeros() {

        Application application = new Application();
            Integer expected = 7;
            Integer response = application.sub(10, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMultiplicar2Num() {

        Application application = new Application();
        Integer expected = 10;
        Integer response = application.mult(2, 5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveDiv2num() {

        Application application = new Application();
        Double expected = 10.0;
        Double response = application.div(10.0, 1.0);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void testeParaPar() {

        Application application = new Application();
        Boolean expected = true;
        Boolean response = application.par(10);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void numeroMaior() {

        Application application = new Application();
        Integer expected = 6;
        Integer response = application.maior( 5,6);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void numeroDePares() {

        Application application = new Application();
        Integer expected = 5;
        Integer response = application.numeroDeImpares(9);
        Assert.assertEquals(expected, response);
    }

    //String
    @Test
    public void testeMaiusc() {

        Application application = new Application();
        String expected = "A";
        String response = application.maiusc("a");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void testeMinusc() {

        Application application = new Application();
        String expected = "a";
        String response = application.minusc("A");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void numLetras(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.contStr("DB1Start");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void quantLetrascespaco(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.contStrSpc(" DB1START ");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void mesmoNumDLetras(){
        Application application = new Application();
        String expected = "DB1START";
        String response = application.returnws(" DB1START ");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void letras4Nome(){
        Application application = new Application();
        String expected = "alys";
        String response = application.primeirasLetras("alyson");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void terceiraLetra(){
        Application application = new Application();
        String expected = "son";
        String response = application.terceiraL("alyson");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void quatroUltimasL(){
        Application application = new Application();
        String expected = "gini";
        String response = application.quatroUltimas("alyson barcellos pegini");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void alunoNome(){
        Application application = new Application();
        String expected = "ALUNO barcellos pegini";
        String response = application.nomeAluno("alyson barcellos pegini");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void contarVogais(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.contVogais("ALYSON");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void separarFrutas() {
        Application application = new Application();
        String[] expected = {"banana", "maça", "melancia"};
        String[] response = application.frutas("banana, maça, melancia");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void palavraInvertida(){
        Application application = new Application();
        String expected = "nosyla";
        String response = application.invertPalavra("alyson");
        Assert.assertEquals(expected, response);
    }

    //double
    @Test
    public void menorValorEm2Dbl(){
        Application application = new Application();
        Double expected = 1.5;
        Double response = application.menorValor(1.5,1.9);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void menorValorEm3Dbl(){
        Application application = new Application();
        Double expected = 1.5;
        Double response = application.menorValor3(1.5,1.9,1.8);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void media(){
        Application application = new Application();
        Double expected = 10.0;
        Double response = application.media3(10.0,10.0,10.0);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void triangulo(){
        Application application = new Application();
        Double expected = 50.0;
        Double response = application.triang(10.0,10.0);
        Assert.assertEquals(expected, response);
    }
}
