package com.avijit.kunalDSA.Recursion;

import java.util.Arrays;

public class SimpRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        recursiveAdd(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void recursiveAdd(int[] arr, int start, int num){
        // base condition is when start index is equal to the arr size.
        if (start > arr.length -1){
            return;
        }
        // adding number to the value
        arr[start] += num;

        // recursively calling functions.
        recursiveAdd(arr, start+1, num);
    }
}
