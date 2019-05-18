package ru.bidonov.task9;

public class Mother {


    public static void main (String[] args)  {

        Child child = new Child ();

        try {
            child.eat (Food.APPLE);
        } catch (Exception e) {
            e.printStackTrace ();
        }

        try {
            child.eat (Food.FISH);
        } catch (Exception e) {
            e.printStackTrace ();
        }

        try {
            child.eat (Food.CAKE);
        } catch (Exception e) {
            e.printStackTrace ();
        }


    }
}
