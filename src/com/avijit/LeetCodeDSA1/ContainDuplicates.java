package com.avijit.LeetCodeDSA1;

import java.util.HashSet;

public class ContainDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};

        System.out.println(duplicateFinder2(arr1));
    }

    public static boolean duplicateFinder(int[] arr){
        int size_of_arr = arr.length;
        HashSet<Integer> arrSet = new HashSet<>();
        for (int x:
             arr) {
            arrSet.add(x);
        }
        int size_of_arrSet = arrSet.size();

        if (size_of_arr == size_of_arrSet) return false;
        else return true;

    }

    public static boolean duplicateFinder2(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) return true;
            set.add(arr[i]);
        }
        return false;

    }


}
