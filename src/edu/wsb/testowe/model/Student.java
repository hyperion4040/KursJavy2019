package edu.wsb.testowe.model;

import java.util.Objects;

public class Student extends AbstractPerson {

    int studentId;

    public Student(String name, String surname, int studentId) {
        super(name, surname);
        this.studentId = studentId;
    }

    @Override
    public void wypiszDane() {
        System.out.println("Dane studenta");
    }


    @Override
    public boolean equals(Object o) {
        Student student = (Student) o;
        return Objects.equals(studentId,student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }



}
