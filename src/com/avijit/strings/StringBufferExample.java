package com.avijit.strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer("Twitter");

        // append
        buf.append("space.");
        System.out.println(buf);

        // insert
        buf.insert(2, "Have");
        System.out.println(buf);

        // replace
        buf.replace(1, 7, "Universe");
        System.out.println(buf);

        // reverse
        buf.reverse();
        System.out.println(buf);

        // capacity
        System.out.println(buf.capacity());

        buf.append("and time");

        System.out.println(buf.capacity());
    }
}
