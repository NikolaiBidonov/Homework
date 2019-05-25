package ru.bidonov.task11;

import java.io.File;

public class Recourse {
    public static void main (String[] args) {

        File dir = new File ("C:/Users/Дом/IdeaProjects/Homework/src");

        recourseShowName (dir);
    }

    private static void recourseShowName (File dir) {

        File[] files = dir.listFiles ();
        for (File file : files) {
            if (file.isFile ()) {
                System.out.println ("  " + file.getName ());
            } else {
                System.out.println (file.getName ());
                recourseShowName (file);
            }
        }
    }
}