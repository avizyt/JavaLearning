package com.avijit.LeetCodeDSA1;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int target = 6                               ;
        int[] res = twoSum(nums2, target);
        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int sum = nums[start] + nums[end];
            if (sum > target){
                end--;
            } else if (sum < target){
                start++;
            } else {
                return new int[]{start, end};
            }

        }
        return new int[]{start, end};
    }

    public static int[] towSum2(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            if(map.containsValue(s){
                map.put(s, nums[s]);

            }
        }
    }
}
