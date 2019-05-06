package ru.bidonov.task7.Person;

public class Child extends Person {
    @Override
    public void run () {
        System.out.println ("Я могу бегать");
    }

    @Override
    public void swim () {
        System.out.println ("Я не умею плавать");
    }
}
