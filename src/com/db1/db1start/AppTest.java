package com.db1.db1start;


import org.junit.Assert;
import org.junit.Test;

import java.util.zip.DeflaterOutputStream;

public class AppTest {

    @Test
    public void deveRetornar5() {

        Application application = new Application();
            Integer expected = 5;
            Integer response = application.soma(2,3);
        Assert.assertEquals(expected,response);


    }
    @Test
    public void deveRetornar8() {

        Application application = new Application();
            Integer expected = 2;
            Integer response = application.sub(5, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar6() {

        Application application = new Application();
        Integer expected = 6;
        Integer response = application.mult(2, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar2() {

        Application application = new Application();
        Double expected = 2.0;
        Double response = application.div(10.0, 5.0);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void testeParaPar() {

        Application application = new Application();
        Double expected = 0.0;
        Double response = application.par(10.0);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void numeroMaior() {

        Application application = new Application();
        Integer expected = 10;
        Integer response = application.maior(10, 5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void numeroDePares() {

        Application application = new Application();
        Integer expected = 5;
        Integer response = application.numeroDeImpares(10);
        Assert.assertEquals(expected, response);
    }
}
