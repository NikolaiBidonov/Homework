package ru.bidonov.task3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);
        System.out.print("Введите первое число ");
        while (!scan.hasNextDouble ()) {
            System.out.print ("Это не число. Попробуйте еще раз ");
            scan.next ();
        }
        double number1 = scan.nextDouble();
        System.out.print("Введите второе число ");
        while (!scan.hasNextDouble ()) {
            System.out.print ("Это не число. Попробуйте еще раз ");
            scan.next ();
        }
        double number2 = scan.nextDouble();

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
