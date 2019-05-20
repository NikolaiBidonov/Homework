package ru.bidonov.task10;

public class Menu {
    private int price;
    Drinks drinks;

    public int getPrice () {
        return price;
    }

    public Menu (int price, Drinks drinks) {
        this.price = price;
        this.drinks = drinks;
    }
}
