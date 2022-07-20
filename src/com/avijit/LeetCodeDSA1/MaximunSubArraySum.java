package com.avijit.LeetCodeDSA1;

public class MaximunSubArraySum {
    public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSumArrKadane(nums));
    }

    public static int maxSumArrBrute(int[] nums){
        int len = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int left = 0; left < len; left++) {
            int windowSum = 0;
            for (int right = left; right < len; right++) {
                windowSum += nums[right];

                if (windowSum > maxSum){
                    maxSum = windowSum;
                    start = left;
                    end = right;
                }
            }
        }
//        logger.info("Found Maximum Sub array between {} and {}\", start, end");
        return maxSum;
    }

    public static int maxSumArrKadane(int[] arr) {
        int size = arr.length;
        int start = 0;
        int end =0;

        int maxSoFar = arr[0], maxEndHere = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > maxEndHere + arr[i]) {
                start = i;
                maxEndHere = arr[i];
            } else {
                maxEndHere = maxEndHere + arr[i];
            }
            if (maxSoFar < maxEndHere) {
                maxSoFar = maxEndHere;
                end = i;
            }
        }

        return maxSoFar;
    }


}
