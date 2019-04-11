package ru.bidonov.task1;

public class Salary {

    public static void main(String[] args) {

        double cash;
        double tax;
        double pay;

        cash = 76325;
        tax = cash * 0.13;
        pay = cash - tax;

        System.out.println("Чистая зарплата на руки " + pay + " рублей.");
    }
}
