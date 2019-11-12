package com.db1.db1start;


import java.util.Scanner;

public class App {

    public static Integer soma(Integer valor1, Integer valor2){
        Integer resultado;
        resultado = valor1 + valor2;

        System.out.println("soma dos valores: " + resultado);
        return resultado;
    }

    public static Integer subtra(Integer valor1, Integer valor2){
        Integer result;
        result = valor1 - valor2;
        System.out.println("subtração dos valores: " + result);
        return result;
    }

    public static String maiusc(String palav){
        System.out.println("palavra em maiúsculo: " + palav.toUpperCase());
        return palav;
    }

    public static String minusc(String palavra){
        System.out.println("palavra em minúsculo: " + palavra.toLowerCase());
        return palavra;
    }

    public static Double menor(Double val1, Double val2){
        if (val1 < val2){
            System.out.println("primeiro valor é menor que segundo valor");
            return  val1;
        } else {
            System.out.println("segundo valor é menor que primeiro valor");
            return val2;
        }
    }

    public static Double menor3(Double val1, Double val2, Double val3){
        if(val1 < val2 && val1 < val3){
            System.out.println("primeiro valor é o menor: " + val1);
            return val1;
        } else if (val1 < val3 && val2 < val1){
            System.out.println("segundo valor é menor: " + val2);
            return val2;
        } else {
            System.out.println("terceiro valor é o menor: " + val3);
            return val3;
        }
    }

    public static void main(String[] args) {
        Integer numero1, numero2, resultado;
        Scanner scan = new Scanner(System.in);

        //soma valores insderidos
        System.out.println("insira um número: ");
        Integer numero001 = scan.nextInt();

        System.out.println("insire outro número: ");
        Integer numero002 = scan.nextInt();

        soma(numero001,numero002);


        //subtração valores inseridos
        System.out.println("insira um número: ");
        Integer numero100 = scan.nextInt();

        System.out.println("insire outro número: ");
        Integer numero200 = scan.nextInt();

        subtra(numero100, numero200);



        //letra maiuscula com valores inseridos pelo usuário
        System.out.println("entre com uma palavra: ");
        String palavra = scan.next();

        maiusc(palavra);

        System.out.println("entre com uma palavra em maiúsculo: ");
            String palavra1 = scan.next();
        minusc(palavra1);


        //menor valor
        System.out.println("digite o primeiro valor: ");
            Double valor1 = scan.nextDouble();

        System.out.println("digite o segundo valor: ");
            Double valor2 = scan.nextDouble();
        menor(valor1,valor2);

        //menor entre 3
        System.out.println("Insira o primeiro valor: ");
        Double primeiro = scan.nextDouble();
        System.out.println("Insira o segundo valor: ");
        Double segundo = scan.nextDouble();
        System.out.println("Insire o terceiro valor: ");
        Double terceiro = scan.nextDouble();
        menor3(primeiro, segundo, terceiro);
    }
}