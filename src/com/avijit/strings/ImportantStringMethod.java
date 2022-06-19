package com.avijit.strings;


public class ImportantStringMethod {
    public static void main(String[] args) {
        String s = "Twitter Space";
        System.out.println(s);

        // lower and upper
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // trim
        System.out.println(s.trim());

        // startsWith and endsWith
        System.out.println(s.startsWith("T"));
        System.out.println(s.endsWith("S"));

        // charAt
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(9));

        // length
        System.out.println(s.length());

        //intern
        String s1 = new String("Twitter Space");
        String s2 = s1.intern();
        System.out.println(s2);

        // valueOf
        int num = 15;
        String str = String.valueOf(num);
        System.out.println(str + 5);

        // replace

        String text = "Java is my fisrt programming language.";
        String replaceStr = text.replace("Java", "Python");
        System.out.println(replaceStr);


    }
}
