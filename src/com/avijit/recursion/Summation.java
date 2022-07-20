package com.avijit.recursion;

public class Summation {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(sum(20));
    }

    public static int sum(final int n) throws IllegalAccessException {
        if (n <= 0)
            throw new IllegalAccessException("n must be >= 1");

        if (n == 1)
            return 1;
        return n + sum(n -1);
    }
}
