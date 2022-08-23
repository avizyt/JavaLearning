package com.avijit.challanges.arraysProb;

public class Finder {
    public static void main(String[] args) {
        int[] arr = {4,2,6,4,7,8,3,11};
        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println("The min of array is: "+min);
        System.out.println("The max of array is: "+max);
    }

    private static int findMax(int[] arr) {
        if (arr.length == 0){
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        if (arr.length == 0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
