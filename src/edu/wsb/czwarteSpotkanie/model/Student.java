package edu.wsb.czwarteSpotkanie.model;

import java.util.HashMap;

public  class Student extends AbstractOsoba {


    int numerIndeksu;

    Enum<Kierunek> kierunek;

    HashMap<String, Float> listaPrzedmiotow;

    public Student(String imie, String nazwisko) {
        super(imie, nazwisko);

    }
    public float zwrocSrednia(){
        return (float) 5.0;
    }

    @Override
    public String wypiszDane() {
        return "Wypisz dane";
    }
}
