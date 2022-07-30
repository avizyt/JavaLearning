package com.avijit.kunalDSA.arrayandlist;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 56, 43, 89};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    static int max(int[] arr){

        if (arr.length == 0){
            return -1;
        }

        int maxVal = arr[0];
        for (int j : arr) {
            if (j > maxVal) {
                maxVal = j;
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int idx1, int idx2){

        if (idx1 > idx2){
            return -1;
        }

        if (arr == null){
            return -1;
        }
        int maxVal = arr[idx1];
        for (int i = idx1; i <= idx2 ; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
        }
        }
        return maxVal;
    }
}
