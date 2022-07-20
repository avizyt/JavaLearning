package com.avijit.LeetCodeDSA1;

public class MargeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int m = arr1.length;
        int n = arr2.length;
        // int[] mergedArr = merge(arr1, m, arr2, n);
//        System.out.println(merge(arr1, m, arr2, n));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int idx = m + n -1;
        while (m >0 || n> 0){
            if (m>0 && n> 0){
                nums1[idx--] = nums2[m-1] > nums2[n-1]?nums1[m-- - 1]:
                nums2[n-- -1];
            }
            else if (m>0 && n == 0) {
                nums1[idx--] = nums1[m-- -1];
            }else {
                nums1[idx--] = nums1[n-- -1];
            }
        }
    }

}
