package ru.bidonov.task9;

public enum Food {
    APPLE ("Яблоко"), CARROT ("Морковь"), CAKE ("Пирог"),
    FISH ("Рыба"), BROCCOLI ("Брокколи"), SOUP ("Суп"),
    LEMON ("Лимон"), TOMATO ("Помидор");

    Food (String title) {
        this.title = title;

    }

    private String title;

    public String getTitle () {
        return title;
    }
}
