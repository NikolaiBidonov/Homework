package ru.bidonov.task7.Person;

public class Sportsman extends Person {
    @Override
    public void run () {
        System.out.println ("Я хорошо бегаю");
    }

    @Override
    public void swim () {
        System.out.println ("Я хорошо плаваю");
    }
}
