package com.itfactory.problemaSuplimentara;
import java.util.Objects;

public class Curs {
    String numeCurs;
    int idCurs;

    public Curs(String numeCurs, int idCurs) {
        this.numeCurs = numeCurs;
        this.idCurs = idCurs;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public void setIdCurs(int idCurs) {
        this.idCurs = idCurs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.itfactory.problemaSuplimentara.Curs curs = (com.itfactory.problemaSuplimentara.Curs) o;
        return idCurs == curs.idCurs && Objects.equals(numeCurs, curs.numeCurs);
    }

    @Override
    public String toString() {
        return  numeCurs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeCurs, idCurs);
    }

    public int getIdCurs() {
        return idCurs;
    }
}