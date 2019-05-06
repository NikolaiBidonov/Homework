package ru.bidonov.task7.Person;

public class Oldman extends Person{
    @Override
    public void run () {
        System.out.println ("Я не бегаю");
    }

    @Override
    public void swim () {
        System.out.println ("Я не плаваю");
    }
}
