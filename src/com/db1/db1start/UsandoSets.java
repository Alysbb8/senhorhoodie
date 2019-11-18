package com.db1.db1start;

import java.util.*;


public class UsandoSets {
    public static void main(String[] args) {
        Set<String> personangens = new HashSet<>();
        personangens.add("Goku");
        personangens.add("Raito");
        personangens.add("Kira");
        personangens.add("L");
        personangens.add("Riuk");
        System.out.println(personangens);

        personangens.remove("L");
        System.out.println(personangens);

        personangens.forEach(System.out::println);

        Optional<String> maybeKira = personangens.stream()
                .filter(s -> s.equals("Kira"))
                .findFirst();
        if(maybeKira.isPresent()){
            System.out.println(maybeKira.get());
        }
        maybeKira.ifPresent(kira -> System.out.println(kira));

        ArrayList<String> ordenados = new ArrayList<> (personangens);
        Collections.sort(ordenados);
        System.out.println(ordenados);



        //crie um set com uma lista de nomes com cinco nomes sendo
        //adicionados mais de uma vez
        //remova os nomes "Suzete", "F*" ou terminados em "naldo"
        //encontre no set "Suzana" (ou não....), se existir exiba
        //com todas as letras maiúsculas
        //em um set com números inteiros encontre o menor, o maior e a média



        }
    public static Set<String> bbshark5nomes(){
        Set<String> babyshark = new HashSet<>();
        babyshark.add("kirito");
        babyshark.add("asuna");
        babyshark.add("gon");
        babyshark.add("killua");
        babyshark.add("killua ");

        System.out.println(babyshark);
        return babyshark;
    }
    public static Set<String> removerSuzaneteFeNaldo(){
        Set<String> nomes = new HashSet<>();
        nomes.add("Suzanete");
        nomes.add("Fonseca");
        nomes.add("Derp");
        nomes.add("Derpina");
        nomes.add("")
        nomes.removeIf(s -> s.startsWith("F"));
        nomes.removeIf(s -> s.startsWith("Suzanete"));
        nomes.removeIf(s -> s.endsWith("Naldo"));

    }

    public static Set<String> menormaior(){

    }
}
