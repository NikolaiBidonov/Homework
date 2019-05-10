package ru.bidonov.task6.Calculator;

public class CalculatorApp {
    public static void main (String[] args) {
        Calculator calculator = new Calculator ();

        System.out.println (calculator.doublePlus (5,3));
        System.out.println (calculator.doubleMinus (5,3));
        System.out.println (calculator.doubleMultiplication (5,3));
        System.out.println (calculator.doubleDividing (5,3));
        System.out.println (calculator.doublePercent (5,3));
        System.out.println (calculator.intPlus (6, 11));
        System.out.println (calculator.intMinus (6, 11));
        System.out.println (calculator.intMultiplication (6, 11));
        System.out.println (calculator.intDividing (11, 6));
        System.out.println (calculator.intPercent (11, 6));
    }
}


