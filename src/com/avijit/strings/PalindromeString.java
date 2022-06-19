package com.avijit.strings;

public class PalindromeString {
    public static void main(String[] args) {
        StringBuilder s = "ababc";
        System.out.println(palindromic(s));

    }

    public static boolean palindromic(StringBuffer s){
        StringBuffer str = s;
        StringBuffer palin = str.reverse();
        if (s.equals(palin)){
            return true;
        }
        return false;
    }
}
