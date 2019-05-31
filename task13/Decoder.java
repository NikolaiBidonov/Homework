package ru.bidonov.task13;

import java.io.*;

public class Decoder {
    final private static String S = "Задание 13";
    public static void main (String[] args) throws IOException {
        File file = new File ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task13/srcFile.txt");
        File dstfile = new File ("C:/Users/Дом/IdeaProjects/Homework/src/ru/bidonov/task13/dstFile.txt");

        try (OutputStream os = new FileOutputStream (file)) {
            os.write (S.getBytes ("UTF8"));
        } catch (IOException e) {
            e.printStackTrace ();
        }
        try(FileInputStream inputStream = new FileInputStream(file);
            FileOutputStream outputStream = new FileOutputStream(dstfile)
        ){
            byte[] buffer = new byte[100];
            inputStream.read(buffer, 0, buffer.length);
            buffer.toString ().getBytes ("GBK");
            outputStream.write(buffer, 0, buffer.length);
        } catch(IOException e){
            e.printStackTrace ();
        }
    }
}

