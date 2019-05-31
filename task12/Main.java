package ru.bidonov.task12;

import java.io.*;

public class Main {
    private static final String fileName = "C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task12/Library.txt";
    public static void main (String[] args) throws IOException, ClassNotFoundException {
        Library library = loadLibrary ();
        Book b1 = new Book ("Кладбище домашних животных", "Стивен Кинг", 1985, 558);
        Book b2 = new Book ("Гарри Поттер и кубок огня", "Д. Роулинг", 2001, 628);
        Book b3 = new Book ("Дети капитана Гранта", "Жюль Верн", 1890, 640);
        Book b4 = new Book ("Сияние", "Стивен Кинг", 1990, 630);

        library.addBook (b1);
        library.addBook (b2);
        library.addBook (b3);
        library.addBook (b4);

        library.showBooks ();
        saveLibrary(library);


    }

    private static Library loadLibrary () throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream (
                new FileInputStream (fileName)
        )) {
            return (Library) ois.readObject ();
        }
    }

    private static void saveLibrary (Library library) {
        try (ObjectOutputStream oos = new ObjectOutputStream (
                new FileOutputStream (fileName)
        )) {
            oos.writeObject (library);
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

}
