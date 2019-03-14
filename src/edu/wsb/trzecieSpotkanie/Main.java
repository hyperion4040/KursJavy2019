package edu.wsb.trzecieSpotkanie;

public class Main {


    public static void main(String[] args){
        int zmienna = 3;
        Student student = new Student("Adrian","Kozłowski");
        System.out.println(student.getImie());
        System.out.println(student);
        Student student2 = new Student("Marcin","Nowak");
        //Student student1 = Student.pobierzDaneStudenta();
        //System.out.print(student1);
        student.setImie("Adam");
        System.out.println(student.getUczelniaNazwa());
        //student.imie = "Adam";
        //Student.wydzial = "Ekonomia";
        student.setUczelniaNazwa("PG");
        System.out.println(student.getUczelniaNazwa() );
        System.out.println(student2.getUczelniaNazwa() );
        student.wypiszPrzedmioty();
        System.out.println();
        student2.wypiszProwadzacych();
    }

}
