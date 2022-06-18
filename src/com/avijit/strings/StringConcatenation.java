package com.avijit.strings;

public class StringConcatenation {
    public static void main(String[] args) {
        String s = 50+30+"is Not"+40+40;
//        System.out.println(s);
        String s1 = "Twitter ";
        String s2 = "Space!";

        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
