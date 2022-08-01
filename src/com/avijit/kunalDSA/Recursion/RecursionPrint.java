package com.avijit.kunalDSA.Recursion;

public class RecursionPrint {
    public static void main(String[] args) {
        int N = 5;
        rprint(5);
        rprintRev(N);
    }
    static void rprint(int N){
        if (N == 0){
            return;
        }
        System.out.println(N);
        rprint(N-1);
    }

    static void rprintRev(int N){
        if (N == 0){
            return;
        }
        rprintRev(N-1);
        System.out.println(N);
    }
}
