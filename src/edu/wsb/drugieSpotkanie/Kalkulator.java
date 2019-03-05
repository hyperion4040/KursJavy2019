package edu.wsb.drugieSpotkanie;

public class Kalkulator {

    static double bokKwadratu;

    public static double pobierzDane(double bokKwadratu){

        if (bokKwadratu > 0){
            return bokKwadratu;
        }else {
            return 0;
        }

    }


    public static double obliczPoleKwadratu(){
       // double wynik = bokKwadratu * bokKwadratu;
        return pobierzDane(2) * pobierzDane(2);
    }

    public static void wypiszPoleKwadratu(){

        if (pobierzDane(2) == 0){
            System.out.print("Wprowadzony bok nie może być " +
                    "liczbą mniejszą lub równą od zera");
        }else {
            System.out.print("Pole kwadratu dla boku "
                    + pobierzDane(2)
                    +" wynosi "
                    + obliczPoleKwadratu());
        }


    }
}
