package ru.bidonov.task5;

import java.util.Scanner;

public class VendingMachine {


    int money;
    int choice;
    int nm;

    Scanner scanner = new Scanner (System.in);

    public void ShowMenu () {
        Menu[] menu = new Menu[8];
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

    public void AddMoney () {
        System.out.print ("Внесите деньги ");
        money = scanner.nextInt ();
        System.out.println ("Вы внесли " + money + " руб");
    }

    public void ChoiceDrink () {
        System.out.println ("Выберите напиток");
        choice = scanner.nextInt ();
        while (choice > 7) {
            System.out.print ("Нет доступного напитка. Выберите напиток из меню ");
            choice = scanner.nextInt ();}
            if (choice == 0) {
                System.out.println ("Вы выбрали Кока-колу");
                while (money < 40) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            if (choice == 1) {
                System.out.println ("Вы выбрали Кока-колу зеро");
                while (money < 40) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            if (choice == 2) {
                System.out.println ("Вы выбрали Спрайт");
                while (money < 40) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            if (choice == 3) {
                System.out.println ("Вы выбрали Фанту");
                while (money < 40) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            if (choice == 4) {
                System.out.println ("Вы выбрали черный чай");
                while (money < 50) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            if (choice == 5) {
                System.out.println ("Вы выбрали зеленый чай");
                while (money < 50) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            if (choice == 6) {
                System.out.println ("Вы выбрали капучино");
                while (money < 80) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            if (choice == 7) {
                System.out.println ("Вы выбрали латте");
                while (money < 100) {
                    System.out.print ("Недостаточно средств. Пополните баланс ");
                    nm = scanner.nextInt ();
                    money = money + nm;
                }
            }
            System.out.println ("Спасибо за покупку");
        }
    }