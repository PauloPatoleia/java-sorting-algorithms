package org.academiadecodigo.bootcamp22.selectionsort;

public class Selection {


    public static void sort(int[] UnsortedArray) {

        for (int LastSortedIndex = UnsortedArray.length-1; LastSortedIndex > 0; LastSortedIndex--) {

            int LargestNumberIndex = 0;

            for (int i = 0; i < LastSortedIndex+1; i++) {

                if(UnsortedArray[LargestNumberIndex] < UnsortedArray[i]) {

                    LargestNumberIndex = i;

                }
            }

            swap(UnsortedArray, LargestNumberIndex, LastSortedIndex);

        }
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
