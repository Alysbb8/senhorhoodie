package com.db1.db1start;

import java.util.*;

public class AulaEstruturaDeDados {

    public static  List<String> colors (){
        //1
        List<String> favcolors = new ArrayList<>();
        favcolors.addAll(Arrays.asList("gray", "red", "blue", "black"));
        return favcolors;

    }

    public static Integer listaQuantidade(String tx1, String tx2, String tx3) {
        //2
        List<String> cores = new ArrayList<>(Arrays.asList(tx1, tx2, tx3));
        return cores.size();
    }

    public static List<String> removerCor(String tx1, String tx2, String tx3){
        //3
        List<String> stuff = new ArrayList<>(Arrays.asList(tx1, tx2, tx3));
        stuff.remove(1);
        return stuff;
    }

    public static void imprimirM1(){

        System.out.println(colors());

    }

    public static void imprimirAlf(){
        Collections.sort(colors());
        System.out.println(colors());
    }

    public static List<String> removCor(List<String> cores, String colorToRemov){
        cores.remove(colorToRemov);
        return cores;
    }

    public static void ordemDecrescAlf(List<String> cores){
        Collections.sort(cores, Collections.reverseOrder());
        cores.forEach(System.out::println);
    }


    private static Map<String, List<Integer>> paresImpares(List<Integer> num){
        Map<String, List<Integer>> mapa = new HashMap<>();
        mapa.put("par", new ArrayList<>());
        mapa.put("impar", new ArrayList<>());
        num.forEach(n ->{
            String chave = n % 2 == 0 ? "par" : "impar";
                mapa.get("impar").add(n);
            });
        return mapa;
    }








    public static void main (String[] args) {

        //1 metodo que retorne as cores que você mais gosta
        //2 método que dado uma lista retorne a quantidade de itens
        //3 método que receba 3 strings, adicione todos em uma lista e remova a segunda posição
        //4 método que imprima as cores do primeiro método
        //5 método que imprima as cores do primeiro método em ordem alfabética
        //6 método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
        //7 método que receba a lista de cores que você gosta e retorne e imprima em ordem decrescente (alfabética)
        //8 método que receba uma lista de números  e retorne um mapa com listas de numeros pares e impares
        //--------------------------------------------------------------------------------------------------------------



//        //1
//                List < String > cores = new ArrayList<>();
//        cores.addAll(Arrays.asList("gray", "red", "blue", "black"));
//        System.out.println(cores);
//
//        //2
//        List<String> cor = new ArrayList<>();
//        cor.addAll(Arrays.asList("gray", "red", "blue", "black"));
//        System.out.println(cor.size());
//
//        //3
//        List<String> stuff = new ArrayList<>();
//        stuff.addAll(Arrays.asList("ovo", "clara", "gema"));
//        System.out.println(stuff);
//        stuff.remove(1);
//        System.out.println(stuff);
//
//
//        //4
//        List<String> colors = cores;
//        System.out.println("printing colors " + colors);
//
//        //5
//        List<String> alfa = cores;
//        Collections.sort(alfa);
//        System.out.println(alfa);
//
//        //6
//        List<String> colorsilike = new ArrayList<>();
//        colorsilike.addAll(Arrays.asList("blue", "black", "red", "gray", "yellow"));
//        System.out.println(colorsilike);
//        colorsilike.removeIf(s -> s.startsWith("y"));
//        System.out.println(colorsilike);
//
//
//        //7
//        Collections.sort(colorsilike);
//        System.out.println(colorsilike);
//        Collections.reverse(colorsilike);
//        System.out.println(colorsilike);

        //8




    }
}
