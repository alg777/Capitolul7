package com.itfactory.problema5;

    //2. Se va crea o clasa Printer care va implementa implementa interfata Task.
    // Aceasta clasa va avea un parametru de tip String (folositi constructor cu parametri).
    //Metoda execute implementata din interfata va afisa string-ul respectiv.

public class Printer implements Task{
    private String text;

    public Printer(String text) {
        this.text = text;
    }

    @Override
    public void executa() {
        System.out.println("Textul cerut este: " + text);

    }

}
