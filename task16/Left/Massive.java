package ru.bidonov.task16.Left;

public class Massive {
    private int [] massive;
    private int elements;

    public Massive (int kolichestvo) {
        massive = new int[kolichestvo];
        elements = 0;
    }

    public void add (int value) {
        massive[elements] = value;
        elements++;
    }
    public void showMassive(){
        for (int i = 0; i < massive.length ; i++) {
            System.out.print (massive[i] + " ");
        }
        System.out.println ();
    }
    public void toLeft () {
        int k = 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < massive.length - 1; j++)
                massive[j] = massive[j + 1];
                massive[massive.length - 1] = 0;
        }
    }
}