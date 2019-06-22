package ru.bidonov.task25_1;

public class App {
    public static void main (String[] args) {
        MapFilter mp = new MapFilter ();
        mp.addPerson ("Иван", "Иванов");
        mp.addPerson ("Петр", "Иванов");
        mp.addPerson ("Александр", "Александров");

        mp.showMap ();
        System.out.println (mp.isUnique ());
    }
}
