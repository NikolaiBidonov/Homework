package ru.bidonov.task6.Converter;

public class Convert {
    public static void main (String[] args) {

    }

    public static Akt convert (Dogovor dogovor) {
        Akt akt = new Akt (dogovor.getNumber (),dogovor.getDate (),dogovor.getTovari ());
        return akt;
    }
}


