package com.avijit.strings;

import java.util.StringJoiner;

public class StrJoiner {
    public static void main(String[] args) {


        StringJoiner s = new StringJoiner(", ");
        s.add("Twitter");
        s.add("Space");
        System.out.println(s.toString());
    }
}
