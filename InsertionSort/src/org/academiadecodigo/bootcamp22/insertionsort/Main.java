package org.academiadecodigo.bootcamp22.insertionsort;

public class Main {

    public static void main(String[] args) {

        int[] array = {50, 30, 10, 70, 60, 20, 40};
        Insertion.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
