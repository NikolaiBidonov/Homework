package ru.bidonov.task7.Animal;

public class App {
    public static void main (String[] args) {
        Pig pig = new Pig ();
        Duck duck = new Duck ();
        Turtle turtle = new Turtle ();

        pig.getName ();
        pig.run ();
        duck.getName ();
        duck.fly ();
        duck.run ();
        duck.swim ();
        turtle.getName ();
        turtle.swim ();
    }
}
