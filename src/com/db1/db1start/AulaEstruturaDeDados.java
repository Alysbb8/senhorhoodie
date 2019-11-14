package com.db1.db1start;

import javax.sound.midi.Soundbank;

import java.util.*;

public class AulaEstruturaDeDados {

    public static void main (String[] args) {

        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Abacaxi");
        frutas.add("Tomate");
        frutas.add("Figo");
        frutas.add("Morango");

        frutas.addAll(Arrays.asList("Jaca", "Caju"));
        System.out.println("Frutas inicias");
        System.out.println(frutas);
        System.out.println("------------------");

        frutas.add("banana");
        System.out.println(frutas.indexOf("Banana"));
        System.out.println(frutas.lastIndexOf("Morango"));
        System.out.println(frutas.size());

        frutas.remove("Banana");
        frutas.add(1,"Jambo");
        System.out.println(frutas);

        frutas.removeIf( f -> f.startsWith("J"));
        System.out.println(frutas);

        for(int i = 0; i < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }

        System.out.println("com for-each");
        for(String a: frutas){
            System.out.println(frutas);
        }

        System.out.println("for-each com lambida");
        frutas.forEach(f -> System.out.println(f));
        frutas.forEach(System.out::println);

        //1 metodo que retorne as cores que você mais gosta
        //2 método que dado uma lista retorne a quantidade de itens
        //3 método que receba 3 strings, adicione todos em uma lista e remova a segunda posição
        //4 método que imprima as cores do primeiro método
        //5 método que imprima as cores do primeiro método em ordem alfabética
        //6 método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
        //7 método que receba a lista de cores que você gosta e retorne e imprima em ordem decrescente (alfabética)
        //8 método que receba uma lista de números  e retorne um mapa com listas de numeros pares e impares
        //--------------------------------------------------------------------------------------------------------------

        //1
        List<String> cores = new ArrayList<>();
        cores.addAll(Arrays.asList("gray", "red", "blue", "black"));

        //2
        cores.size();

        //3
        List<String> stuff = new ArrayList<>();
        stuff.addAll(Arrays.asList("ovo", "clara", "gema"));
        stuff.remove(1);

        //4
        List<String> colors = cores;
        System.out.println("printing colors " + colors);

        //5
        List<String> alfa = cores;
        Collections.sort(alfa);
        System.out.println(alfa);

        //6
        List<String> colorsilike = new ArrayList<>();
        colorsilike.addAll(Arrays.asList("blue", "black", "red", "gray", "yellow"));
        colorsilike.removeIf(s -> s.startsWith("y"));

        //7
        Collections.sort(colorsilike);
        for(int i = 0; i < ; i--)



    }
}
