package org.academiadecodigo.bootcamp22.bubblesort;

public class Main {

    public static void main(String[] args) {

        int[] array = {14, 2, 13, 42, 1};

        Bubble.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
