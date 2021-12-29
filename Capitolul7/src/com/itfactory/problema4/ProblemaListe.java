package com.itfactory.problema4;

import java.util.ArrayList;
import java.util.List;

public class ProblemaListe {
//    Problema4.b
//    Sa se creeze o clasa simpla (ProblemaListe) in care se va defini doar main.
//    Se cere sa se creeze o lista de numere intregi (folosind List din java).
//    Folosind o bucla while se cere sa se genereze numere intregi
//    (folosind Random)
//    pana in momentul in care numarul generat este 10.
//    (cand se genereaza 10 se iese din bucla).
//    Fiecare numar generat pana la intalnirea lui 10 este introdus in lista de mai sus.
//    Mai departe, daca lista va contine elemente se vor numara cate aparitii ale numarului 5 sunt.
//      Indicatii:
//      1.Se va folosi metoda isEmpty() din obiectul de tip lista
//      pentru verificare daca lista este goala
//
//    Exemplu de rulare:
//    Presupunem ca s-au generat numerele 2 5 4 16 5 11 18 5 7 10 (la 10 ma opresc)
//    Introduc numerele intr-0 lista.
//    Parcurg lista si cand intalnesc valoarea 5 incrementez un contor.
//    (Un contor inseamna  ca ne definim o variabila de tip int
//    pe care o incrementam cand intalnim valoarea 5 in lista).

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int numar =(int) (Math.random()*11);
        while (numar!=10){
            integers.add(numar);
            numar = (int) (Math.random()*11);
        }
        //integers.add(numar); asta il va face vizibil pe 10 in lista
        System.out.println(integers);
        if(integers.isEmpty()){
            System.out.println("Lista este goala");
        }else{
            int j = 0;
            for (Integer integer : integers) {
                if (integer == 5) {
                    j++;
                }
            }
            System.out.println("Numarul 5 a aparut in lista de " + j+" ori.");
        }
    }
}

