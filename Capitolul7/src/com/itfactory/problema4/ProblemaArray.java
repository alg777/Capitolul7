package com.itfactory.problema4;

import java.util.Scanner;

public class ProblemaArray {
//    Problema4.a
//    Sa se creeze o clasa simpla (ProblemaArray) in care se va defini main.
//    Pentru aceasta problema se cere sa se initieze un array de stringuri citite de la tastatura.
//    (Numarul il stabiliti voi. Alegeti cel putin 3 elemente ca sa nu fie nici 1 sau 2
//    ca nu ar mai avea sens array-ul).
//
//    Se cere sa se construiasca un alt array de stringuri de aceeasi dimensiune
//    in care sa se introduca elementele din primul array construit in ordine inversa.
//    (Acesta nu il mai veti citi de la tastatura)
//    Exemplu:
//    array1 in care elementele sunt citite de la tastatura: mar par cireasa banana
//    array2 pe care il veti construi pe baza array1: banana cireasa par mar.
//    Se vor afisa ambele array-uri element cu element folosind parcurgerea cu for.
    public static void main(String[] args) {
        String[] array1 = new String[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduceti nume obiect: ");
            array1[i]=scanner.nextLine();
        }
        for (int i = 0; i <3 ; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.print("/");

        String[] array2 = new String[3];
        for (int i = 0; i < 3; i++) {
            array2[i]= array1[array1.length-1-i];
            System.out.print(array2[i]+" ");
        }


    }
}
