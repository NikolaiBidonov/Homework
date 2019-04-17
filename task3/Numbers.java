package ru.bidonov.task3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        System.out.print("Введите первое число ");
        Scanner num1 = new Scanner(System.in);
        double number1 = num1.nextDouble();
        System.out.print("Введите второе число ");
        Scanner num2 = new Scanner(System.in);
        double number2 = num2.nextDouble();

        if (number1 == number2) {
            System.out.println("Числа равны");
        } else {
            if (number1 < number2) {
                System.out.println("Первое число " + number1 + " меньше");
            } else {
                System.out.println("Второе число " + number2 + " меньше");
            }
        }
    }
}
