package com.company;

import static junit.framework.TestCase.assertEquals;

public class bubbleSort {
    public static<E extends Comparable<E>> void bubbleSort(E[] arr) {
        for (int j = arr.length - 1; j >= 0; j--) {
            for (int i = 1; i <= j; i++) {
                if (arr[i-1].compareTo(arr[i]) > 0) {
                    E tmp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
}
