package com.avijit.strings;

public class StringJoinMethod {
    public static void main(String[] args) {
        String s1 = new String("Twitter");
        String s2 = new String("Space.");

        String s = String.join(" ",s1, s2);
        System.out.println(s);

    }
}
