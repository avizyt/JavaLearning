package com.avijit.kunalDSA.arrayandlist;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 24, 35, 67, 81};
//        swap(arr, 1, 3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start += 1;
            end -= 1;
        }
    }
}
