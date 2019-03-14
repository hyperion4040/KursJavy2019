package edu.wsb.czwarteSpotkanie.model;

public class Absolwent extends Student {


    float ocenaPracyDyplomowej;

     double zwrocOcenaPracyDyplomowej(){
        return 5.0;
    }

    @Override
    public float zwrocSrednia() {
        return (float) 4.5;
    }

    public Absolwent(String imie, String nazwisko) {
        super(imie, nazwisko);
    }
}
