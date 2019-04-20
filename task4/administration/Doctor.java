package ru.bidonov.task4.administration;

import ru.bidonov.task4.Person;

import java.time.LocalDate;

public class Doctor extends Person {
    private String category;
    private int salary;

    public Doctor (String name, String surname) {
        super (name, surname);
    }


    public String getCategory () {
        return category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public int getSalary () {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    @Override
    public String toString () {
        return "Doctor{" +
                "category='" + category + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

