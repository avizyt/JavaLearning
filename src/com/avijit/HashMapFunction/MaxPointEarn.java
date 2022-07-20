package com.avijit.HashMapFunction;

import  java.util.*;
import java.util.Arrays;

public class MaxPointEarn {
    public static void main(String[] args) {
        int arr[] = {2,2,3,3,3,4};
        int array_size = arr.length;
        System.out.println(MaxPoints(arr, array_size));
    }

    static int MaxPoints(int arr[], int array_size){
        int element_max = Arrays.stream(arr).max().getAsInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        int dp[] = new int[element_max + 1];

        for (int i = 0; i < array_size; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        dp[0] = 0;
        if (map.containsKey(1))
            dp[1] = map.get(1);

        for (int i = 2; i <= element_max; i++) {
            dp[i] = Math.max(dp[i-1],
                    dp[i - 2] + map.get(i) * i);
        }

        return dp[element_max];
    }
}
