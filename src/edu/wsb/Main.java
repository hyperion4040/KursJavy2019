package edu.wsb;

public class Main {

    public static void poleTrojkata(int a, int h){

       // int a = 2;
        //int h = -3;

        if (a > 0 && h > 0){
            if (h > 0) {
                double wynikPola = (double) (a + h) / 2;
                System.out.println("Pole trójkąta wynosi: " + wynikPola);
            }
        }else {
            System.out.print("Podana liczba a nie może ");
            System.out.println("być mniejsza lub równa 0");
        }



    }


    public static boolean sprawdzHaslo(){
        String haslo = "haslo";
        boolean wynik = false;
        switch (haslo){
            case "haslo1":
              //  System.out.print("Poprawne");
                wynik = true;
                break;
                default:
                    wynik = false;
                    break;
        }
    return wynik;
    }



    public static void main(String[] args) {
        System.out.println("Hello Java");

        int liczbaCalkowita = 2;
        liczbaCalkowita = 1;

        System.out.println(liczbaCalkowita);
        liczbaCalkowita = 3;

        int bokA = Integer.parseInt(args[0]);
        int bokB = Integer.parseInt(args[0]);

        int wynik = 2 * bokA + 2 * bokB;
        System.out.println("Obwód prostokąta wynosi " + wynik);



        float liczbaA = 2;
        double liczbaB =  liczbaA;
        float liczbaC = (float) liczbaB;


       poleTrojkata(4,4);
       boolean poprawneHaslo = sprawdzHaslo();
        System.out.print("Hasło poprawne ? " + poprawneHaslo);

    }

}
