package com.db1.db1start;

public class Application {

    //integer
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

    public Boolean par(Integer num1){
        return num1%2==0;
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
            if(val1%2 == 0){
                return val1/2;
            }

        return val1 = (val1 + 1)/2;
    }

    //string
    public String maiusc(String str1){
        return str1.toUpperCase();
    }

    public String minusc(String str1){
        return str1.toLowerCase();
    }

    public Integer contStr(String str1){
        return str1.length();
    }

    public Integer contStrSpc(String str1){
        Integer cont = 0;
        for(int x = 0; x < str1.length();x++){
            if(Character.isLetter(str1.charAt(x)) == true){
                cont++;
            }
        }
        return cont;
    }

    public String returnws(String str1){
        return str1.trim();
    }

    public String primeirasLetras(String str1){
        String role = "";
        for(int x=0; x < 4;x++){
            role += str1.charAt(x);
        }
        return role;
    }

    public String terceiraL(String nome){
        String role = "";
        for(int x = 3 ; x < nome.length(); x++){
            role += nome.charAt(x);
        }
        return role;
    }

    public String quatroUltimas(String nome){
        String role = "";
        for(int x = nome.length()-4; x < nome.length(); x++ ){
            role += nome.charAt(x);
        }
        return role;
    }

    public String nomeAluno(String name){
        String alun = "ALUNO";
        Integer pos = 0;
        for (int x = 0; x < name.length(); x++) {
            if (name.charAt(x) == ' ') {
                pos = x;

            x = name.length();
            }
        }
        for (int y = pos; y < name.length(); y++){
            alun += name.charAt(y);
        }
        return alun;
    }

    public String[] frutas(String fruta){
        String [] frutinha;
        frutinha = fruta.split(", ");
        return frutinha;
    }


    public Integer contVogais(String txt){
        return txt
                .toUpperCase()
                .replaceAll("[^AEIOU]","")
                .length();
    }

    public String invertPalavra(String txt){
        String str2 = "";
        for(int x = txt.length() - 1; x >= 0; x--){
            str2 = str2 + Character.toString(txt.charAt(x));
        }
        return str2;
    }

    //double
    public Double menorValor(Double val1, Double val2){
        if(val1 < val2){
            return val1;
        }
        return val2;
    }

    public Double menorValor3(Double val1, Double val2, Double val3){
        if(val1 < val2 && val1 < val3){
            return val1;
        }
        if(val2 < val1 && val2 < val3){
            return val2;
        }
        return val3;
    }

    public Double media3(Double val1, Double val2, Double val3){
        Double media;
        media = (val1 + val2 + val3)/3;
        return media;
    }

    public Double triang(Double base, Double altura){
        Double area = (base*altura)/2;
        return area;
    }
}
