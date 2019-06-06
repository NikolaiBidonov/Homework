package ru.bidonov.task16.Left;

public class Main {
    public static void main (String[] args) {
        Massive array = new Massive (10);
        array.add (1);
        array.add (2);
        array.add (3);
        array.add (4);
        array.add (5);
        array.add (6);
        array.add (7);
        array.add (8);
        array.add (9);
        array.add (10);

        array.showMassive ();
        array.toLeft ();
        array.showMassive ();
    }
}
