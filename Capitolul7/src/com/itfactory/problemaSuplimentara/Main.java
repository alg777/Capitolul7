package com.itfactory.problemaSuplimentara;



import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student stud = new Student("Iaru Emil", 25);
        Profesor prof = new Profesor("Ali Baba", 35);

        Curs curs1 = new Curs("matematica", 101);
        Curs curs2 = new Curs("filozofie", 106);


        List<Curs> cursStud = new ArrayList<>();
        cursStud.add(new Curs("matematica", 101));
        cursStud.add(new Curs("statistica", 102));
        cursStud.add(new Curs("programare", 103));
        cursStud.add(new Curs("filozofie", 104));

        List<Curs> cursProf = new ArrayList<>();
        cursProf.add(new Curs("matematica", 101));
        cursProf.add(new Curs("statistica", 102));
        cursProf.add(new Curs("matematica discreta", 105));



        stud.setCursStud(cursStud);
        //prof.setCursProf(cursProf); nu e nevoie. pentru ca nu am getters and setters
        //in clasa Profesor.

        System.out.println("Cursurile studentului: "+ stud.numeComplet +
                           "\n"+ stud.getCursStud()+"\n");

        System.out.println("Cursurile profesorului: "+ prof.numeComplet +
                            "\n"+ cursProf);

        cursStud.retainAll(cursProf);
        System.out.println("\nCursuri comune: "+ cursStud);
        if(cursStud.contains(curs1)){
            System.out.println("Cursul de <"+ curs1.numeCurs+ "> este comun profesorului si studentului");
        }else{
            System.out.println("Cursul de "+ curs1.numeCurs+ " nu este comun profesorului si studentului");
        }
    }
}