package com.avijit.challanges.arraysProb;


import java.util.Arrays;

public class EvenBeforeOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
//        orderEvenBeforeOdd(arr);
        orderEvenBeforeOddOptim(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void orderEvenBeforeOdd(int[] arr) {
        int i = 0;

        while (i < arr.length){
        int val = arr[i];
            if (isEven(val)){
                i++;
            }else {
                int j = i+1;
                while (j< arr.length && !isEven(arr[j])){
                    j++;
                }
                if (j < arr.length){
                    swap(arr, i, j);
                }else
                    break;
            }
        }i++;
    }

    public static void orderEvenBeforeOddOptim(int[] arr){
        int nextEven = 0;
        int nextOdd = arr.length - 1;

        while (nextEven < nextOdd){
            int currVal = arr[nextEven];
            if (isEven(currVal)){
                nextEven++;
            }else {
                swap(arr, nextEven, nextOdd);
                nextOdd--;
            }
        }
    }

    static boolean isEven(int num){
        return num%2 == 0;
    }

    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
