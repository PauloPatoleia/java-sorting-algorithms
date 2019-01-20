package org.academiadecodigo.bootcamp22.insertionsort;

public class Insertion {

    public static void sort(int[] UnsortedArray) {

        for (int i = 1; i < UnsortedArray.length; i++) {

            int newElement = UnsortedArray[i];

            int j;

            for (j = i; j > 0 && UnsortedArray[j - 1] > newElement; j--) {

                    UnsortedArray[j] = UnsortedArray[j-1];
            }

            UnsortedArray[j] = newElement;
        }
    }
}
