package ru.bidonov.task17;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main (String[] args) {
        Comparator<Person> comparator = new NameComparator ().thenComparing (new AgeComparator ());
        ArrayList<Person> list = new ArrayList<> ();
        list.add (new Person ("Иван", 25));
        list.add (new Person ("Андрей", 21));
        list.add (new Person ("Тимофей", 34));
        list.add (new Person ("Андрей", 28));
        list.add (new Person ("Иван", 15));
        list.sort (comparator);
        for (Person person : list) {
            System.out.println (person);

        }
    }
}
