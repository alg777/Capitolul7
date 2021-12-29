package com.itfactory.problemaSuplimentara;
//1.3. Se creeaza clasa Profesor care va mosteni clasa Persoana.
// Clasa Profesor va avea ca proprietate in plus o lista de cursuri.
// (cursurile pe care le tine profesorul)

import java.util.List;

public class Profesor extends Persoana{
    private List cursProf;

    public Profesor(String numeComplet, int age) {
        super(numeComplet, age);

    }
//nu am getters and setters
//nu am toString()
}
