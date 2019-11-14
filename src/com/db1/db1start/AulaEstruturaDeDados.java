package com.db1.db1start;

import javax.sound.midi.Soundbank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        for(String s: frutas){
            System.out.println(frutas);
        }

        System.out.println("for-each com lambida");
        frutas.forEach(f -> System.out.println(f));
        frutas.forEach(System.out::println);


        
    }

}
