package com.avijit.kunalDSA.arrayandlist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(21);
        list.add(31);
        list.add(41);
        list.add(51);
        list.add(61);

        System.out.println(list.contains(11));
        System.out.println(list);
        list.set(4,52);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
    }
}
