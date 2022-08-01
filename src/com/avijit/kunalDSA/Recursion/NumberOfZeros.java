package com.avijit.kunalDSA.Recursion;

public class NumberOfZeros {
        static int cnt = 0;
    static int countZeros(int n){

        if (n == 0){
            return 0;
        }

        int rem = n % 10;
        if (rem == 0){
            cnt += 1;
//            countZeros(n/10);
        }
        countZeros(n/10);
        return cnt;
    }

    static int countZeros2(int n, int c){
        if (n%10 == 0){
            c += 1;
        }
        countZeros2(n/10, c);
        return c;
    }

    public static void main(String[] args) {
        int num = 30204;
        System.out.println(countZeros(num));
        System.out.println(countZeros2(num, 0));
    }
}
