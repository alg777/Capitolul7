package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema1 {
//    Problema 1.
//    Sa se creeze un program simplu (O clasa Main cu metoda main)
//    in care se va defini un array de elemente de tip int (primitiva).
//    Lungimea array-ului (int) se va citi de la tastatura.
//    (Folositi <int lungime = Integer.parseInt(scanner.nextLine());>
//    pentru a citi int-ul (contraindicat scanner.nextInt()).
//    Cu ajutorul unei bucle for se vor introduce in array elemente random intre 0 si 20.
//    Afisati array-ul.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti lungime array: ");
        int lungime = Integer.parseInt(scanner.nextLine());

        // Problema 1 rezolvata cu List
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < lungime; i++) {
            integers.add((int)(Math.random()*21));
        }
        System.out.println("\nProblema 1 rezolvata cu List:");
        System.out.println(integers);

        System.out.println("___________________________" +
                           "\nProblema 1 rezolvata cu Array:");

        int[] integers1 = new int[lungime];
        for (int i = 0; i < integers1.length; i++) {
            integers1[i]=(int)(Math.random()*21);
        }
        for(int integer: integers1) {
            System.out.print(integer + " ");
        }

    }

}
