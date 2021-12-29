package com.itfactory.problema5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //4. Se va crea o clasa Main cu metoda main
    //   unde se va initializa o lista de Task-uri (folosind List din java).
    //5. Se va crea o bucla for de 10 iteratii in care la fiecare iteratie
    //   se va genera un numar random intre 0 si 1. Daca numarul generat este 0
    //   atunci se va introduce in lista un task de tipul Printer.
    //   Daca numarul generat este 1 se va introduce in lista un task de tipul Insumare.
    //   (La constructie alegeti voi parametrii.)
    //6. Se va parcurge lista si se vor executa task-urile fiecarui element
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num =(int)(Math.random()*2);//genereaza doar 0 si 1
            switch (num) {
                case 0 -> {
                    Task printer = new Printer("text de tiparit");
                    printer.executa();
                }
                case 1 -> {
                    Task sum = new Insumare(12, 14);
                    sum.executa();
                }
            }

        }

    }
}
