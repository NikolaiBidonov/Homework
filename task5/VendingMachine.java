package ru.bidonov.task5;

import java.util.Scanner;

public class VendingMachine implements ShowMenu, AddMoney, ChoiceDrink {

    Scanner scanner = new Scanner (System.in);
    Menu[] menu = new Menu[8];
    private int money;
    private int choice;

    @Override
    public void addMoney () {
        System.out.print ("Добро пожаловать! Внесите деньги ");
        money = scanner.nextInt ();
        System.out.println ("Вы внесли " + money + " руб");
    }

    @Override
    public void choiceDrink () {
        System.out.println ("Выберите напиток");
        choice = scanner.nextInt ();
        for (int i = 0; i < menu.length; i++) {
            if (choice == i) {
                System.out.println ("Вы выбрали " + menu[i].drinks.getTitle ());
                while (money < menu[i].price) {
                    System.out.println ("Недостаточно средств. Пополните баланс");
                    money = money + scanner.nextInt ();
                }
                System.out.println ("Спасибо за покупку");
                money = money - menu[i].price;
                System.out.println ("Ваша сдача " + money + " руб");
            }
        }
    }

    @Override
    public void showMenu () {
        menu[0] = new Menu (40, Drinks.COKE);
        menu[1] = new Menu (40, Drinks.COKEZERO);
        menu[2] = new Menu (40, Drinks.SPRITE);
        menu[3] = new Menu (40, Drinks.FANTA);
        menu[4] = new Menu (50, Drinks.BLACKTEA);
        menu[5] = new Menu (50, Drinks.GREENTEA);
        menu[6] = new Menu (80, Drinks.CAPUCCINO);
        menu[7] = new Menu (100, Drinks.LATTE);

        for (int i = 0; i < menu.length; i++) {
            System.out.println ("Клавиша " + i + " - " + menu[i].drinks.getTitle () + " " +
                    menu[i].price + " руб");
        }
    }
}
