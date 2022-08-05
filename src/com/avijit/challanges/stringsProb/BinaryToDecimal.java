package com.avijit.challanges.stringsProb;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String[] numbers = {"011001", "1001110101"};
        for (String numb:
                numbers) {
            System.out.println(binToDec(numb));
        }
    }
    private static boolean isBinaryNumb(String str){
        boolean isBinary = true;
        int i = 0;
        while (i < str.length() && isBinary){
            char currChar = str.charAt(i);
            isBinary = (currChar == '0' || currChar == '1');
            i++;
        }
        return isBinary;
    }

    public static int binToDec(String num){
        if (!isBinaryNumb(num)){
            throw new IllegalArgumentException(num + " is not Binary!!");
        }

        int decVal = 0;
        for (int i = 0; i < num.length(); i++) {
            int curr = num.charAt(i) - '0';
            decVal = decVal * 2 + curr;
        }
        return decVal;
    }

}
