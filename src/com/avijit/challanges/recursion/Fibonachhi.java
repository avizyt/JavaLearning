package com.avijit.challanges.recursion;

import java.util.HashMap;

public class Fibonachhi {
    public static void main(String[] args) {
        int num = 10;
//        long number = fibRecursion(num);
        long numMemo = fibOptim(num);
        System.out.println(numMemo);

    }
    static long fibRecursion(int n){
        if (n <= 0){
            throw new IllegalArgumentException("n must be > 0");
        }

        if (n == 1 || n == 2){
            return 1;
        }
        return fibRecursion(n-1) + fibRecursion(n -2);
    }

    static long fibOptim(int n){
        return fibMemo(n, new HashMap<>());
    }

    private static long fibMemo(int n, HashMap<Integer, Long> lookUpMap) {
        if (n <= 0){
            throw new IllegalArgumentException("n must be > 0");
        }

        if (lookUpMap.containsKey(n)){
            return lookUpMap.get(n);
        }

        long res = 0;
        if (n == 1|| n ==2){
            res = 1;
        }else {
            res = fibMemo(n-1, lookUpMap) + fibMemo(n-2, lookUpMap);
        }
        lookUpMap.put(n, res);
        return res;
    }
}
