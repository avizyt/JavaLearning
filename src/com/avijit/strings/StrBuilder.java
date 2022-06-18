package com.avijit.strings;

public class StrBuilder {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Twitter!");
        StringBuilder s2 = new StringBuilder();
        StringBuilder s = s1.append(s2);
        System.out.println(s);
    }
}
