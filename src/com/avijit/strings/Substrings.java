package com.avijit.strings;

import java.util.Arrays;

public class Substrings {
    public static void main(String[] args) {
        String s = "NewScientistOfOurWorld!";
        String text = "New Scientist Of Our World!";

        System.out.println("Original String: "+ s);
        System.out.println("Substring : "+ s.substring(4));
        System.out.println("Substring start to end: "+ s.substring(3, 12));

        System.out.println("=====================================");
        String[] sent = text.split("\\.");
        System.out.println(Arrays.toString(sent));
    }
}
