package ru.bidonov.task2;

import java.util.Scanner;

public class Gazoline2 {
    public static void main(String[] args) {

        System.out.println("Введите количество литров бензина ");
        Scanner lit = new Scanner(System.in);
        System.out.println("Введите цену бензина ");
        Scanner pr = new Scanner(System.in);

        if (pr.hasNextDouble() & lit.hasNextDouble()) {
            double price = pr.nextDouble();
            double liter = lit.nextDouble();
            double cost = price * liter;
            System.out.println("Стоимость бензина за " + liter + " л по цене " + price + " руб, равна " + cost +
                    " руб.");
        } else {
            System.out.println("Введите корректную стоимость и количество литров");
        }
        lit.close();
        pr.close();
    }
}
