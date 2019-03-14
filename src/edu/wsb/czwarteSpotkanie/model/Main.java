package edu.wsb.czwarteSpotkanie.model;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Adrian","Kozlowski");
        student.wypiszDane();

        Student student1 = new Absolwent("Adrian","Kozlowski");
        student1.wypiszDane();

        Osoba osoba = new Student("Adrian","Kozlowski");

        float ocena =  ((Student) osoba).zwrocSrednia();
        System.out.println(ocena);
        Osoba osoba1 = new Absolwent("Adrian","Kozlowski");
        ((Absolwent) osoba1).zwrocOcenaPracyDyplomowej();
        float ocena1 =  student1.zwrocSrednia();
        System.out.println(ocena1);


    }

}
