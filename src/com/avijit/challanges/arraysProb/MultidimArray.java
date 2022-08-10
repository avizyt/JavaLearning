package com.avijit.challanges.arraysProb;


public class MultidimArray {
    public static void main(String[] args) {
        final char[][] arr2d = {"abcde".toCharArray(),
                "fghij".toCharArray(),
                "klmno".toCharArray(),
                "pqrst".toCharArray(),
                "uvwxy".toCharArray()};
    printArray(arr2d);
    }

    public static void printArray(char[][] val){
        for (int row = 0; row < val.length; row++) {
            for (int col = 0; col < val[row].length; col++) {
                char value = getAt(val, col, row);
                System.out.print(value+ " ");
            }
            System.out.println();
        }
    }
    public static char getAt(char[][] val, int x, int y){
        return val[y][x];
    }

}
