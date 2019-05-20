package ru.bidonov.task10;

public enum Drinks {
    BLACKTEA ("Черный чай"), GREENTEA ("Зеленый чай"), CAPUCCINO ("Капучино"),
    LATTE ("Латте"), COKE ("Кока-кола"), FANTA ("Фанта"), SPRITE ("Спрайт"),
    COKEZERO ("Кока-кола зеро");

    Drinks (String title) {
        this.title = title;
    }

    String title;

    public String getTitle () {
        return title;
    }
}
