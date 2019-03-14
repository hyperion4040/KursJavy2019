package edu.wsb.czwarteSpotkanie.model;

public abstract class AbstractOsoba implements Osoba {

    String imie;
    String nazwisko;

    public AbstractOsoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
