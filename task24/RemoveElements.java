package ru.bidonov.task24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveElements {
    public static void main (String[] args) {
        Set<String> set = new HashSet<> ();
        set.add("День");
        set.add("Солнце");
        set.add("Май");
        set.add(".");
        set.add("Кот");

        System.out.println (set);
        Iterator<String> iterator = set.iterator ();
        while (iterator.hasNext ()) {
            String str = iterator.next ();
            if (str.length () % 2 ==0) {
                iterator.remove ();
            }
        }
        System.out.println (set);
    }
}
