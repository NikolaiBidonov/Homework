package ru.bidonov.task6.Count;

public class MethodsCounter {
    public static void main (String[] args) {

        Counter one = new Counter ();
        Counter two = new Counter ();
        Counter three = new Counter ();

        System.out.println ("Создано " + Counter.count + " объектов");
    }
}
