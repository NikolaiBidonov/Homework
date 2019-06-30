package ru.bidonov.task29;

import java.util.Objects;

public class Person {

    private int age;
    private String surname;
    private String gender;

    public Person (int age, String surname, String gender) {
        this.age = age;
        this.surname = surname;
        this.gender = gender;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public String getGender () {
        return gender;
    }

    public void setGender (String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals (surname, person.surname) &&
                Objects.equals (gender, person.gender);
    }

    @Override
    public int hashCode () {
        return Objects.hash (age, surname, gender);
    }

    @Override
    public String
    toString () {
        return "Person{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
