package ru.bidonov.task7.Animal;

public class Duck extends Animal implements Run, Swim, Fly {
    @Override
    public void getName () {
        System.out.println ("Утка");
    }

    @Override
    public void fly () {
        System.out.println ("Я летаю");
    }

    @Override
    public void run () {
        System.out.println ("Я бегаю");
    }

    @Override
    public void swim () {
        System.out.println ("Я плаваю");
    }
}
