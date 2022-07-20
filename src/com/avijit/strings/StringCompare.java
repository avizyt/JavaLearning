package com.avijit.strings;

public class StringCompare {
    public static void main(String[] args) {
        System.out.println("==============String Comparison===========");
        String s1 = "Twitter!";
        String s2 = "TWITTER!";

        String s3 = new String("Twitter!");

//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.equalsIgnoreCase(s3));
//        System.out.println(s1 == s3);

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}
