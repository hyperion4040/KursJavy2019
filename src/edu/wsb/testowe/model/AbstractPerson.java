package edu.wsb.testowe.model;

import java.util.Objects;

public abstract class AbstractPerson implements Person {

    String name;
    String surname;



    public AbstractPerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public AbstractPerson() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPerson that = (AbstractPerson) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
