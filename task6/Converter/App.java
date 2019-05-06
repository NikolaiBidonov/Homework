package ru.bidonov.task6.Converter;

import java.util.ArrayList;

public class App {

    public static void main (String[] args) {
        ArrayList tovari = new ArrayList ();
        tovari.add ("Лопата");
        tovari.add ("Молоток");

        Dogovor dogovor = new Dogovor (52514, "01.05.2019", tovari);
        System.out.println (Convert.convert (dogovor));
    }
}
