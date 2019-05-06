package ru.bidonov.task7.Person;

public class Application {
    public static void main (String[] args) {
        Child child = new Child ();
        Oldman oldman = new Oldman ();
        Sportsman sportsman = new Sportsman ();

        child.run ();
        child.swim ();

        oldman.run ();
        oldman.swim ();

        sportsman.run ();
        sportsman.swim ();
    }
}
