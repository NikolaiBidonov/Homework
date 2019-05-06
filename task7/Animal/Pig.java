package ru.bidonov.task7.Animal;

public class Pig extends Animal implements Run {
    @Override
    public void getName () {
        System.out.println ("Поросенок");
    }

    @Override
    public void run () {
        System.out.println ("Я бегаю");
    }
}
