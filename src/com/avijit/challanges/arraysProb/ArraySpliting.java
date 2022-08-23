package com.avijit.challanges.arraysProb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySpliting {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        int[] result = arraySplit(arr, 4);
        int[] result = arraySplitInplace(arr, 4);
        System.out.println(Arrays.toString(result));
    }

    static int[] arraySplit(int[] arr, int refEl) {
        List<Integer> lesser = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            if (cur < refEl) {
                lesser.add(cur);
            } else {
                greater.add(cur);
            }
        }

        List<Integer> res = new ArrayList<>();
        res.addAll(lesser);
        res.add(refEl);
        res.addAll(greater);
        return res.stream().mapToInt(i -> i).toArray();
    }

    static int[] arraySplitInplace(int[] arr, int refEl){
        int low = 0;
        int high = arr.length - 1;

        while (low < high){
            while ( low < high && arr[low] < refEl){
                low++;
            }
            while ( high > low && arr[high] >= refEl){
                high--;
            }
            if (low < high){
                swap(arr, low, high);
            }
        }
        return integratedRefEl(arr, high, refEl);
    }

    private static int[] integratedRefEl(int[] arr, int pos, int refEl) {

        int[] res = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        res[pos] = refEl;
        for (int i = pos+1; i < arr.length + 1; i++) {
            res[i] = arr[i-1];
        }
        return res;

    }


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
