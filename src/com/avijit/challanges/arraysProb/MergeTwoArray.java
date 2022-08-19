package com.avijit.challanges.arraysProb;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10,11,12, 13, 14, 15};
        int[] arr = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] merge(int[] first, int[] second){
        int length1 = first.length;
        int length2 = second.length;

        int[] result = new int[length1 + length2];

        int pos1 = 0;
        int pos2 = 0;
        int idx = 0;

        while (pos1 < length1 && pos2 < length2){
            int val1 = first[pos1];
            int val2 = second[pos2];

            if (val1 < val2){
                result[idx] = val1;
                idx++;
                pos1++;
            }else {
                result[idx] = val2;
                idx++;
                pos2++;
            }
        }
//        while (pos1 < length1){
//            result[idx] = first[pos1];
//            idx++;
//            pos1++;
//        }
//        while (pos2 < length2){
//            result[idx] = second[pos2];
//            idx++;
//            pos2++;
//        }
        addRemains(first, result, pos1, idx);
        addRemains(second, result, pos2, idx);
        return result;
    }

    static void addRemains(int[] arr, int[] result, int pos, int idx){
        while (pos < arr.length){
            result[idx] = arr[pos];
            idx++;
            pos++;
        }
    }
}
