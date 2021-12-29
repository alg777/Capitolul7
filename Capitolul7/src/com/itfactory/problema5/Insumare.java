package com.itfactory.problema5;

    //3. Se va crea o clasa Insumare care va implementa implementa interfata Task.
    // Aceasta clasa va avea doi parametri de tip int(folositi constructor cu parametri).
    // Metoda execute, implementata din interfata, va afisa suma celor doua numere.

public class Insumare implements Task{
    private int num1;
    private int num2;

    public Insumare(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void executa() {
        int sum =num1+num2;
        System.out.println("Suma este: "+sum);


    }
}
