package ru.bidonov.task2;

import java.util.Scanner;

public class Game {
    public static void main (String[] args) {

        int a = 1;
        int b = 100;
        int random = a + (int) (Math.random () * b);
        System.out.println (random);
        Scanner number = new Scanner (System.in);
        System.out.println ("Введите число. Для выхода из игры нажмите 0");
        while (number.hasNext ()) {
            int num = number.nextInt ();
            if (num == random) {
                System.out.println ("Вы угадали");
                break; }
                if (num == 0) {
                    System.out.println ("Выход");
                    break;
                } else {
                    System.out.print ("Попробуй снова ");
                    number.hasNext();
                }
        }
    }
}
