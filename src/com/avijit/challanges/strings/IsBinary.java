package com.avijit.challanges.strings;


/**
 * Write a method that checks a given
 * string consist only of the character 0 and 1.
 */
public class IsBinary {
    public static void main(String[] args) {
        String[] numbers = {"0112001", "1001110101"};
        for (String numb:
             numbers) {
            System.out.println(isBinaryNumb(numb));
        }

    }

    public static boolean isBinaryNumb(String str){
        boolean isBinary = true;
        int i = 0;
        while (i < str.length() && isBinary){
            char currChar = str.charAt(i);
            isBinary = (currChar == '0' || currChar == '1');
            i++;
        }
        return isBinary;
    }

}
