package com.avijit.kunalDSA.linearSearch;

import java.util.Arrays;
import java.util.Random;

public class RandomIntList {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(Arrays.toString(arr));
        }
    }
}
