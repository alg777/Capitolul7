package com.itfactory.problema6;
//1. Se va creea o clasa Produs cu proprietatile denumire si pret. (stabiliti tipurile corect).
// Constructor cu parametri.
// Generati metoda equals corespunzator dupa modelul de la curs.

import java.util.Objects;

public class Produs {
    String denumire;
    double pret;

    @Override
    public String toString() {
        return  denumire  +" cu pretul de: " + pret ;
    }

    public Produs(String denumire) {
        this.denumire = denumire;
    }

    public Produs(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {return denumire;}

    public double getPret() {return pret;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return Double.compare(produs.pret, pret) == 0 && Objects.equals(denumire, produs.denumire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(denumire, pret);
    }
}
