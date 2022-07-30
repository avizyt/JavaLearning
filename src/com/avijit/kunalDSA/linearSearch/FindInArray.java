package com.avijit.kunalDSA.linearSearch;


public class FindInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,25,87};
        System.out.println(find(arr, 25));
        System.out.println(findIndex(arr, 252));
    }
    static boolean find(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
    static int findIndex(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
