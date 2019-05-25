package ru.bidonov.task11;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class WorkWithFile {
    public static void main (String[] args) {

        System.out.println ("=== Создание файла ===");
        File file = new File ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task11/task11.txt");
        try {
            file.createNewFile ();
            System.out.println ("Файл создан");
        } catch (IOException e) {
            System.out.println ("Не удалось создать файл :" + e.getMessage ());
        }

        System.out.println ("=== Переименование файла ===");
        file.renameTo (new File ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task11/task11rename.txt"));
        System.out.println ("Файл переименован");

        System.out.println ("=== Копирование файла ===");
        Path firstFile = Paths.get ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task11/task11rename.txt");
        Path copyFirstFile = Paths.get ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task11/task11copy.txt");
        try {
            Files.copy (firstFile, copyFirstFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println ("Файл скопирован");
        } catch (IOException e) {
            System.out.println ("Не удалось скопировать файл: " + e.getMessage ());
        }

        System.out.println ("=== Удаление файла ===");
        try {
            Files.delete (copyFirstFile);
            System.out.println ("Файл удален");
        } catch (IOException e) {
            System.out.println ("Не удалось удалить файл: " + e.getMessage ());
        }
    }
}