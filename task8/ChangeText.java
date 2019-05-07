package ru.bidonov.task8;

public class ChangeText {
    public static void main (String[] args) {

        String s1 = "Эй, бяка, иди сюда, бяка!";
        String s2 = s1.replaceAll ("бяка", "вырезано цензурой");
        System.out.println (s2);
    }
}
