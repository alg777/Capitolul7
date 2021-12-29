package com.itfactory.problema6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2. Să se creeze clasa Main cu metoda main în care se va crea o listă de produse (= inventarProduse)
//       (Presupunem ca este stocul unui magazin).
//3. Se da un numar int (n) citit de la tastatura,
//       care va determina câte produse se vor citi mai departe (la fel de la tastatura)
//4. Mai departe se vor citi n produse de la tastatura.
//       Dacă în lista definită la punctul 2,  produsul citit există deja,
//       se va afisa un mesaj, dacă nu există, produsul citit se va adăuga in listă.
//5. Afișati lista finală.


public class Main {
    public static void main(String[] args) {
        List<Produs> inventarProduse =new ArrayList<>();
        inventarProduse.add(new Produs("bluza", 70.00));
        inventarProduse.add(new Produs("vesta", 33.99));
        inventarProduse.add(new Produs("manusi", 23.99));

        System.out.println(inventarProduse +"\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Câte produse noi doriți să citiți? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Introduceți nume produs: ");
            String numeNou = scanner1.nextLine();

            System.out.println("Introduceți prețul: ");
            double pretNou = scanner.nextDouble();
            Produs produsNou = new Produs(numeNou, pretNou);

            if(!inventarProduse.contains(produsNou)) {
                inventarProduse.add(produsNou);
            }else{
                System.out.println("Produsul: <"+ produsNou.getDenumire()+
                        " cu pretul "+ produsNou.getPret()+"> exista in stoc");}
        }
        System.out.println("Produsele din inventar sunt:");
        for (Produs produs : inventarProduse) {
            System.out.println(produs);
        }
    }
}
