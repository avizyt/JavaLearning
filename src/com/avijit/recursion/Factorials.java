package com.avijit.recursion;

public class Factorials {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(factorial(5));
    }

    public static int factorial(final int n) throws IllegalAccessException {
        if (n < 0)
            throw new IllegalAccessException("n must be >= 0");

        // recursive termination
        if (n == 0 || n == 1)
            return 1;

        // recursion descent
        return n * factorial(n - 1);
    }
}
