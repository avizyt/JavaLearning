package com.avijit.sortings;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {17,6,2,4,8,13,21,14};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx])
                    idx = j;
            }
            int small = arr[idx];
            arr[idx] = arr[i];
            arr[i] = small;
        }
        return arr;
    }
}
