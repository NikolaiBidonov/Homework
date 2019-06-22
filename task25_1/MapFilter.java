package ru.bidonov.task25_1;

import java.util.*;

public class MapFilter {

    HashMap<String, String> person = new HashMap<> ();

    public void addPerson (String name, String surname) {
        person.put (name, surname);
    }

    public void showMap () {
        System.out.println (person);
    }

    public boolean isUnique () {
        for (String str : person.values ()) {
            if (Collections.frequency (person.values (), str) > 1) {
                return false;
            }
        }
        return true;
    }
}

