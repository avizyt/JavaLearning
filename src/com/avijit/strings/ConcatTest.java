package com.avijit.strings;

public class ConcatTest {
    public static String concatWithString() {
        String t = "Twitter";
        for (int i = 0; i < 10000; i++) {
            t = t + " Space";
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Twitter");
        for (int i = 0; i < 10000; i++) {
            sb.append(" Space");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by  String: "+ startTime + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("time taken by Concatenating with StringBuffer: "+(System.currentTimeMillis())+"ms");
    }
}
