package edu.wsb.drugieSpotkanie;

public class Loops {

   static double  matematyka[];

    public static double zwrocSrednia(){
        matematyka = new double[3];
        matematyka[0] = 4;
        matematyka[1] = 4;
        matematyka[2] = 4;
        double wynik = 0;
        for (int i = 0; i < matematyka.length; i++) {
            wynik = wynik + matematyka[i];
        }
        return wynik/matematyka.length;
    }


    public static double zwrocSrednia(double[] przedmiot){
        double wynikOstateczny = 0;
        for(double wynik : przedmiot){
            wynikOstateczny += wynik;
        }
        return wynikOstateczny;

    }

    public static double zwrocSrednia(float[] przedmiot){
        int dlugoscTablicy = 0;
        while (dlugoscTablicy < przedmiot.length){
            dlugoscTablicy++;
        }

        do {
            dlugoscTablicy++;
        }while (dlugoscTablicy < przedmiot.length);

        return dlugoscTablicy;
    }



    public static void wypiszSrednia(){
        System.out.print(zwrocSrednia());
    }

}
