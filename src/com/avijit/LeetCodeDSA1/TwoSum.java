package com.avijit.LeetCodeDSA1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int target = 6                               ;
        int[] res = twoSumHash(nums2, target);
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

    public static int[] twoSumHash(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)){
                return new int[] {
                        map.get(temp), i
                };
            }
                else {
                    map.put(nums[i], i);
                }
            }
            return new int[] {};
        }
    }

