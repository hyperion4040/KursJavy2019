package edu.wsb.testowe;

import edu.wsb.testowe.model.Absolvent;
import edu.wsb.testowe.model.Person;
import edu.wsb.testowe.model.Student;

public class App {

    public static void main(String[] args) {
        Person person = new Student("Adrian","Kozlow",2);
        Person person1 = new Student("Adrian","Kozlow",1);
        System.out.println("Czy studenci są identyczni ? " + person.equals(person1));
        person = new Absolvent();
        person1 = new Absolvent();
        System.out.println("Czy absolwenci są identyczni ? " + person.equals(person1));

    }

}
