package ru.bidonov.task17;

import java.util.Comparator;

class NameComparator implements Comparator<Person> {
    public int compare (Person a, Person b){
        return a.getName ().compareTo (b.getName ());
    }
}
class AgeComparator implements Comparator<Person> {
    public int compare (Person a, Person b) {
        return Integer.compare (a.getAge (), b.getAge ());
    }
}
