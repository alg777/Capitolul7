package com.itfactory.problemaSuplimentara;

public class Persoana {
    String numeComplet;
    int age;

    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Persoana(String numeComplet, int age) {
        this.numeComplet = numeComplet;
        this.age = age;

    }
}

