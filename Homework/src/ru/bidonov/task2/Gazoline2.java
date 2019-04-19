package ru.bidonov.task2;

import java.util.Scanner;

public class Gazoline2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print ("Введите количество литров ");
        while (!scanner.hasNextDouble ()) {
            System.out.println ("Введите корректное количество литров");
            scanner.next ();
        }
        double liter = scanner.nextDouble ();
        System.out.print ("Введите цену бензина ");
        while (!scanner.hasNextDouble ()) {
            System.out.println ("Введите корректную цену");
            scanner.next ();
        }
        double price = scanner.nextDouble ();
        double cost = liter * price;
        System.out.println ("Стоимость бензина за " + liter + " л. по цене " + price +
                " руб. составляет " + cost + " руб");
    }
}
