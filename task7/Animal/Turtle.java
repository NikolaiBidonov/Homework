package ru.bidonov.task7.Animal;

public class Turtle extends Animal implements  Swim {
    @Override
    public void getName () {
        System.out.println ("Черепаха");
    }

    @Override
    public void swim () {
        System.out.println ("Я плваваю");
    }
}
