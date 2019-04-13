package ru.bidonov.task2;

import java.util.Scanner;

public class SecondsToHours2 {
    public static void main(String[] args) {

        System.out.println("Введите количество секунд");
        Scanner time = new Scanner(System.in);

        if (time.hasNextDouble()) {
            double seconds = time.nextDouble();
            double hours = seconds / 3600;
            System.out.println(seconds + " секунд - это " + hours + " часов.");
        } else {
            System.out.println("Введите корректное количество секунд");
        }
        time.close();
    }
}

