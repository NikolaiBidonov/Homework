package ru.bidonov.task29;

public class App {
    public static void main (String[] args) {

        System.out.println ("Содержимое мапы до удаления");
        System.out.println (HashApp.createMap ());
        System.out.println ("Содержимое мапы после удаления");
        HashApp.removeTheDuplicates (HashApp.createMap ());

    }
}
