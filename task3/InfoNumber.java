package ru.bidonov.task3;

import java.util.Scanner;

public class InfoNumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Введите число ");
        while (!num.hasNextDouble ()) {
            System.out.print ("Это не число. Попробуйте снова ");
            num.next ();
        }
        double number = num.nextDouble();

        if (number > 0 & number % 2 == 0)
            System.out.println("Число " + number + " четное и положительное");
        if (number < 0 & number % 2 == 0)
            System.out.println("Число " + number + " четное и отрицательное");
        if (number > 0 & number % 2 != 0)
            System.out.println("Число " + number + " нечетное и положительное");
        if (number < 0 & number % 2 != 0)
            System.out.println("Число " + number + " нечетное и отрицательное");
        if (number == 0) {
            System.out.println("Введеное число = 0");
        }
    }
}
