package edu.wsb.trzecieSpotkanie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Student {

   private String imie;
   private String nazwisko;

   private static final String wydzial = "Informatyka";

   private static String uczelniaNazwa = "WSB";

   private static ArrayList<String> listaPrzedmiotow;

   private static HashSet<String> listaProwadzacych;




    public static Student pobierzDaneStudenta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię studenta");
        String imie = scanner.nextLine();
        System.out.print("Podaj jego nazwisko");
        String nazwisko = scanner.nextLine();
        return new Student(imie,nazwisko);

    }

    public void setUczelniaNazwa(String nazwa){
        uczelniaNazwa = nazwa;
    }

    public String getUczelniaNazwa(){
        return uczelniaNazwa;
    }

    public Student(String imie,String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaPrzedmiotow = new ArrayList<>();
        listaPrzedmiotow.add("Matematyka");
        listaPrzedmiotow.add("Algebra");
        listaPrzedmiotow.add("Matematyka");

        listaProwadzacych = new HashSet<>();

        listaProwadzacych.add("Nowak");
        listaProwadzacych.add("Smith");
        listaProwadzacych.add("Nowak");
        listaProwadzacych.add("Adal");



    }


    public void wypiszPrzedmioty(){
        for (String przedmiot  : listaPrzedmiotow){
            System.out.println(przedmiot);

        }
    }

    public void wypiszProwadzacych(){
        for (String prowadzacy : listaProwadzacych){
            System.out.println(prowadzacy);
        }
    }


    public String getImie(){
        return imie;
    }

    public void setImie(String imie){
        if (!imie.isEmpty()){
            this.imie = imie;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' + ", wydział " + wydzial +
                '}';
    }
}
