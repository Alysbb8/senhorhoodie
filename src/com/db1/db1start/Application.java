package com.db1.db1start;

public class Application {

    public Integer soma(Integer val1, Integer val2) {
        return val1 + val2;
    }

    public Integer sub(Integer val1, Integer val2){
        return val1 - val2;
    }

    public Integer mult(Integer val1, Integer val2){
        return val1 *val2;
    }

    public Double div(Double val1, Double val2){
        return val1/val2;

    }

    public Double par(Double num1){
        return num1%2;
    }


    public Integer maior(Integer val1, Integer val2){
        if(val1 > val2){
            System.out.println("val1 é maior");
            return val1;
        }
            System.out.println("val2 é maior");
            return val2;
    }

    public Integer numeroDeImpares(Integer val1){
        Integer contador = 0;
        for (Integer cont = 0; cont <= val1; cont++){
            if(val1%2 !=  0){
                 contador++;
            }
        }
        return contador;
    }
}
