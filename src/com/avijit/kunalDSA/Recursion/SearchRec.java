package com.avijit.kunalDSA.Recursion;

public class SearchRec {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(recSea(arr,7, 0, arr.length-1));
    }

    static int recSea(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end- start)/2;

        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid]){
            return recSea(arr, target, start, mid - 1);
        }

        return recSea(arr, target, mid+1, end);

    }
}
