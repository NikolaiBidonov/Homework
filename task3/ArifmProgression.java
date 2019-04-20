package ru.bidonov.task3;

import java.util.Scanner;

public class ArifmProgression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Введите начало прогрессии ");
        while (!scanner.hasNextDouble ()) {
            System.out.print("Вы ввели не число. Попробуйте снова ");
            scanner.next ();
        }
        double first = scanner.nextDouble ();
        System.out.print ("Введите шаг прогрессии ");
        while (!scanner.hasNextDouble ()) {
            System.out.println ("Вы ввели не число. Попробуйте снова ");
            scanner.next ();
        }
        double D = scanner.nextDouble ();
        for (double a = first; a < 20; a = a + D) {
            System.out.print(a + " ");
        }
    }
}
