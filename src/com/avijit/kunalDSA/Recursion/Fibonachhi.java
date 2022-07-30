package com.avijit.kunalDSA.Recursion;

public class Fibonachhi {
    public static void main(String[] args) {
        int val = fibNorm(6);
        System.out.println(val);
    }

    static int fibNorm(int num){
        if (num <2){
            return num;
        }
        int val = fibNorm(num -1) + fibNorm(num - 2);
        return val;
    }
}
