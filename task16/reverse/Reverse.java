package ru.bidonov.task16.reverse;

public class Reverse {
    private int [] massive = {1,2,3,4,5,6,7,8,9};

        public void showMassive () {
            for (int i = 0; i < massive.length; i++) {
                System.out.print (massive[i] + " ");
            }
            System.out.println ();
        }
        public void doReverse() {
            for (int i = 0, j = massive.length - 1; i < massive.length / 2; i++, j--) {
                int tmp = massive[i];
                massive[i] = massive[j];
                massive[j] = tmp;
            }
        }

}
