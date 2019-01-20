package org.academiadecodigo.bootcamp22.selectionsort;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 1, 98, 43, 23, 54, 3, 6, -5, 1029};

        Selection.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
