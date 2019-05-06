package ru.bidonov.task6;

public class Calculator {

        static double plus ( double a, double b){
            return a + b;
        }
        static double minus ( double a, double b){
            return a - b;
        }
        static double multiplication (double a, double b) {
            return a * b;
        }
        static double dividing (double a, double b) {
            return a / b;
        }
        static  double percent (double a, double b) {
            return a * b / 100;
        }

    public static void main (String[] args) {
        System.out.println (plus (5,3));
        System.out.println (minus (5,3));
        System.out.println (multiplication (5,3));
        System.out.println (dividing (5,3));
        System.out.println (percent (5,3));
    }
}


