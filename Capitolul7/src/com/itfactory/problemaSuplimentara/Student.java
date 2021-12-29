package com.itfactory.problemaSuplimentara;
//1.3. Se creeaza clasa Student care va mosteni clasa Persoana.
// Clasa Student va avea ca proprietate in plus,
// o lista de cursuri.(cursurile la care merge studentul)
import java.util.List;

public class Student extends Persoana{
    private List cursStud;

    //Constructor
    public Student(String numeComplet, int age) {
        super(numeComplet, age);

    }

    //Getter and Setter
    public List getCursStud() {
        return cursStud;
    }

    public void setCursStud(List cursStud) {
        this.cursStud = cursStud;
    }
    //nu am toString


}
