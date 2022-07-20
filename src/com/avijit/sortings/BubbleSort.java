package com.avijit.sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {17,6,2,4,8,13,21,14};
        bubble_sort(arr);
    }

    public static void bubble_sort(int arr[]){
        int n = arr.length;
        int k;
        for (int m = n; m >= 0 ; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]){
                    swapNum(i, k, arr);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    private static void swapNum(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
