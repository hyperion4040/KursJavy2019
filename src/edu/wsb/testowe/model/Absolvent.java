package edu.wsb.testowe.model;

import java.util.Objects;

public class Absolvent extends AbstractPerson {

    @Override
    public boolean equals(Object o) {
        Absolvent absolvent = (Absolvent) o;

        return Objects.equals(name,absolvent.name) && Objects.equals(surname,absolvent.surname);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void wypiszDane() {

    }
}
