package ru.bidonov.task2;

import java.util.Scanner;

public class Salary2 {
    public static void main(String[] args) {

        System.out.println("Введите вашу зарплату");
        Scanner money = new Scanner(System.in);

        if (money.hasNextDouble()) {
            double cash = money.nextDouble();
            double TAX = 0.13;
            double minusTax = cash * TAX;
            double pay = cash - minusTax;
            System.out.println("Чистая зарплата на руки " + pay + " руб.");
        } else {
            System.out.println("Введите корректную зарплату");
        }
        money.close();
    }
}
