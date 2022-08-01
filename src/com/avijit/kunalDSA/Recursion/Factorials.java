package com.avijit.kunalDSA.Recursion;

public class Factorials {
    public static void main(String[] args) {
        System.out.println(facto(5));
    }

    static int facto(int N){
        if (N <= 1){
            return 1;
        }
        int val = N * facto(N-1);
        return val;
    }
}
