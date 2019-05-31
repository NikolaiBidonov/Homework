package ru.bidonov.task14;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main (String[] args) throws FileNotFoundException {
        FileInputStream is = new FileInputStream ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task14/product.txt");
        PrintStream os = new PrintStream ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task14/check.txt");
        Scanner scanner = new Scanner (is);

        int count = 1;
        float total = 0;
        os.println ("Кассовый чек");
        os.printf ("%-20s" + "%6s" + "%16s" + "%13s", "Наименование", "Цена", "Количество", "Стоимость");
        os.println ();
        os.println ("---------------------------------------------------");

        while (scanner.hasNext ()) {
            String name = scanner.nextLine();
            float kolichestvo = Float.parseFloat(scanner.nextLine());
            float price = Float.parseFloat(scanner.nextLine());
            os.printf (count + " %-20s %-6.2f * %-6.2f = %10.2f\n", name, kolichestvo, price, kolichestvo * price);
            count++;
            total += kolichestvo * price;
        }
        os.println ("====================================================");
        os.printf("Итого: %45.2f", total);



    }
}
