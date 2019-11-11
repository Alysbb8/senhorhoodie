package com.db1.db1start;


import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Integer numero1, numero2, resultado;
        Scanner scan = new Scanner(System.in);

        //soma valores insderidos
        System.out.println("insira um número: ");
        Integer numero001 = scan.nextInt();

        System.out.println("insire outro número: ");
        Integer numero002 = scan.nextInt();

        System.out.println("soma dos númeors: " +  (numero001 + numero002));

       /*soma valores pre definidos
        numero1 = 50;
        numero2 = 40;
        resultado = numero1 + numero2;
        System.out.println(resultado);
        */

        //subtração valores inseridos
        System.out.println("insira um número: ");
        Integer numero100 = scan.nextInt();

        System.out.println("insire outro número: ");
        Integer numero200 = scan.nextInt();

        System.out.println("subtração dos números: " + (numero100 - numero200));

         /* numeros pre definidos
         Integer numero01, numero02, result;
         numero01 = 30;
         numero02 = 98;
            result = numero01 - numero02;
            System.out.println(result);
        */

        //letra maiuscula com valores inseridos pelo usuário
        System.out.println("entre com uma palavra: ");
        String palavra = scan.next();

        System.out.println(palavra.toUpperCase() + " em maiúsculo ");

        System.out.println("entre com uma palavra em maiúsculo: ");
        String palavra1 = scan.next();

        System.out.println(palavra1.toLowerCase() + " em minúsculo ");

        /*valores pre estabelecidos
        String maiuscula;
        maiuscula = "abcdc";
        System.out.println(maiuscula.toUpperCase());

        String minuscula;
        minuscula = "ABCD";
        System.out.println(minuscula.toLowerCase());
        */

        /*menor variavel
        Double variavel1, variavel2;
        variavel1 = 3.2;
        variavel2 = 3.3;
        if (variavel1 < variavel2){
            System.out.println(variavel1 + "  é menor que " + variavel2);
        } else {
            System.out.println(variavel2 + " é o menor que "+ variavel1);
        }
        */

        System.out.println("digite o primeiro valor: ");
        Double valor1 = scan.nextDouble();

        System.out.println("digite o segundo valor: ");
        Double valor2 = scan.nextDouble();
        if (valor1 < valor2){
            System.out.println("primeiro valor é menor que segundo valor");
        } else {
            System.out.println("segundo valor é menor que segundo valor");
        }



        /*menor em tres
        Double var1, var2, var3;
        var1 = 5.5;
        var2 = 6.4;
        var3 = 9.2;
        if (var1 < var2 && var1 < var3){
            System.out.println(var1 + " é o menor número ");
        }
        if (var2 < var1 && var2 < var3){
            System.out.println(var2 + " é o menor número ");
        }
        if (var3 < var1 && var3 < var2){
            System.out.println(var3 + " é o menor número ");
        }
        */

        System.out.println("Insira o primeiro valor: ");
        Double primeiro = scan.nextDouble();
        System.out.println("Insira o segundo valor: ");
        Double segundo = scan.nextDouble();
        System.out.println("Insire o terceiro valor: ");
        Double terceiro = scan.nextDouble();
        if(primeiro < segundo && primeiro < terceiro){
            System.out.println("primeiro valor é o menor" + primeiro);
        } else if (segundo < terceiro && segundo < primeiro){
            System.out.println("segundo valor é menor" + segundo);
        } else {
            System.out.println("terceiro valor é o menor" + terceiro);
        }
    }
}