package com.avijit.strings;

public class StringExmple {
    public static void main(String[] args) {

        // string using literal
        String s1 = "Morning!";
        String s11 = "Morning!";

        char ch[] = {'M','o','r','n','i','n','g'};

        String s2 = new String(ch);

        String s3 = new String("Good Morning");

        System.out.println(s1.equals(s11));
        System.out.println(s2);
        System.out.println(s3);

    }
}
