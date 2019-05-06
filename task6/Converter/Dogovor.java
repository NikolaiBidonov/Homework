package ru.bidonov.task6.Converter;

import java.util.ArrayList;

public class Dogovor {
    private int number;
    private String date;
    private ArrayList tovari;

    public ArrayList getTovari () {
        return tovari;
    }

    public void setTovari (ArrayList tovari) {
        this.tovari = tovari;
    }

    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public Dogovor (int number, String date, ArrayList tovari) {
        this.number = number;
        this.date = date;
        this.tovari = tovari;
    }

    @Override
    public String toString () {
        return "Dogovor{" +
                "number=" + number +
                ", date='" + date + '\'' +
                ", tovari=" + tovari +
                '}';
    }
}


