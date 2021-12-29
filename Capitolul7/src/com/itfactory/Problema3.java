package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema3 {
//    Problema 3.
//    Sa se creeze un program simplu (O clasa Main cu metoda main) in care se va defini
//    o lista de Stringuri (List<String>).
//    Mai departe se vor citi de la tastatura mai multe String-uri
//    (Alegeti un număr relativ mic, să nu vă complicati. De exemplu 3-4 valori sunt de ajuns).
//    Aceste String-uri se vor introduce în listă, doar dacă nu contin litera "a".
//    (se va verfifica cu metoda contains din String)
//    Exemplu:
//    Introduceti cuvantul: birou // O să-l introduc.(nu conține litera a).
//    Introduceti cuvantul: pară // Nu o să-l introduc.(conține litera a).

    public static void main(String[] args) {
        List<String> listaStrings = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti un cuvant: ");
            String word = scanner.nextLine();
            if(!word.contains("a")){
                listaStrings.add(word);
            }
        }
        System.out.println("Cuvinte care nu contin litera a: "+ listaStrings);
    }
}
