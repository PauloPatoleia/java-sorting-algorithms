package org.academiadecodigo.bootcamp22.bubblesort;

public class Bubble {

    public static int[] sort(int[] array) {

        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {

            for (int i = 0; i < lastSortedIndex; i++) {

                if (array[i] > array[i+1]) {

                    swap(array, i, i+1);

                }
            }
        }

        return array;
    }

    private static void swap(int[] array, int i, int j) {

        if(array[i] == array[j]) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
