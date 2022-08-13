package com.avijit.challanges.arraysProb;

import java.util.Arrays;

public class RotationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        rotateRight(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateRight(int[] arr){
        if (arr.length < 2){
            return;
        }
        final int last = arr.length -1;
        final int temp = arr[last];

        for (int i = last; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void rotateLeft(int[] arr){
        if (arr.length < 2){
            return;
        }
        int last = arr.length-1;
        int temp = arr[0];

        for (int i = 0; i < last; i++) {
            arr[i] = arr[i+1];
        }
        arr[last] = temp;
    }
}
