package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema2 {
//    Problema 2.
//    Sa se creeze un program simplu (O clasa Main cu metoda main) in care se va defini
//    un array de elemente de tip String. Lungimea array-ului (int) se va citi de la tastatura.
//    (Folositi <int lungime = Integer.parseInt(scanner.nextLine());> pentru a citi int-ul
//    (contraindicat scanner.nextInt()).
//    Cu ajutorul unei bucle for se vor introduce in array elemente citite de la tastatura.
//    Afisati array-ul.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungime array: ");
        int lungime = Integer.parseInt(scanner.nextLine());
        List<String> elemente= new ArrayList<>();

        for (int i = 0; i <lungime; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Introduceti un element: ");
            String elementNou = scanner.nextLine();
            elemente.add(elementNou);
        }
        System.out.println(elemente);

    }

}
