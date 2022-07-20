package com.avijit.recursion;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,0};
        System.out.println(isPalindromeSimpleRecursive(arr));
    }

    public static boolean isPalindromeSimpleRecursive(final int[] val){
        // recursive termination
        if (val.length <= 1)
            return true;
        int left = 0;
        int right = val.length - 1;

        if (val[left] == val[right])
        {
            // attention: copyOfRange() is exclusive end
            final int[] remainder = Arrays.copyOfRange(val, left+1, right);
            // recursive descent
            return isPalindromeSimpleRecursive(remainder);
        }

        return false;
    }

}
