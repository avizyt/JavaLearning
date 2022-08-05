package com.avijit.challanges.stringsProb;

public class HexToDecimal {
    public static void main(String[] args) {

    }

    public static int hexToDec(String num){
        if (!isHexNum(num)) throw new IllegalArgumentException(num +" is not hex number!!");

        int decVal = 0;
        for (int i = 0; i < num.length(); i++) {
            char currChar = num.charAt(i);
            int val = Character.getNumericValue(currChar);
            decVal = decVal * 16 + val;
        }

        return decVal;
    }

    private static boolean isHexNum(String num){
        boolean isHex = true;

        String upperCaseNumb = num.toUpperCase();

        int i = 0;
        while (i < upperCaseNumb.length() && isHex){
            char currChar = upperCaseNumb.charAt(i);
            isHex = Character.isDigit(currChar) || currChar >= 'A' && currChar <= 'F';
            i++;
        }
        return isHex;
    }
}

