package org.academiadecodigo.bootcamp22.selectionsort;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 10, 50, 30, 40, 80, 70, 60};

        Selection.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
