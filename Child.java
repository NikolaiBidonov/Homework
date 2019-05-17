package ru.bidonov.task9;

import java.util.Scanner;

public class Child {
    Scanner scanner = new Scanner (System.in);
    private int choice;
    private FoodList[] foodList = new FoodList[8];


    public void eat () throws BadFoodException {
        System.out.println ("Чем накормим ребенка?");
        foodList[0] = new FoodList (Food.BROCCOLI);
        foodList[1] = new FoodList (Food.APPLE);
        foodList[2] = new FoodList (Food.CAKE);
        foodList[3] = new FoodList (Food.CARROT);
        foodList[4] = new FoodList (Food.FISH);
        foodList[5] = new FoodList (Food.LEMON);
        foodList[6] = new FoodList (Food.SOUP);
        foodList[7] = new FoodList (Food.TOMATO);

        for (int i = 0; i < foodList.length; i++) {
            System.out.println ("Клавиша " + i + " - " + foodList[i].food.getTitle ());
        }

        choice = scanner.nextInt ();

        for (int i = 0; i < foodList.length; i++) {
            try {
                if (choice == i) {
                    System.out.println ("Съел " + foodList[i].food.getTitle ());
                } else {
                    throw new BadFoodException ();
                }
            } catch (BadFoodException e) {
                System.out.println ("Внимание! Вы дали " + foodList[i].food.getTitle () + ": " + e.getMessage ());
            } finally {
                System.out.println ("Спасибо, мама!");
            }
        }
    }
}


