package ru.bidonov.task9;

public class BadFoodException extends Exception {

    @Override
    public String getMessage () {
        return "Еда не съедена";
    }
}
