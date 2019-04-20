package ru.bidonov.task4;

import java.time.LocalDate;

public class Person {
    public String name;
    public String surname;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }




}
