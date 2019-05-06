package ru.bidonov.task6.Converter;

import java.util.ArrayList;

public class Akt {
    private int number;
    private  String date;
    private ArrayList tovari;

    public Akt (int number, String date, ArrayList tovari) {
        this.number = number;
        this.date = date;
        this.tovari = tovari;
    }

    @Override
    public String toString () {
        return "Akt{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", tovari=" + tovari +
                '}';
    }
}

