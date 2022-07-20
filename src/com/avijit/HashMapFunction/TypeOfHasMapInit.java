package com.avijit.HashMapFunction;

import java.util.HashMap;

public class TypeOfHasMapInit {
    public static void main(String[] args) {
        HashMap<String, Integer> mapOne = new HashMap<>();

        HashMap<String, Integer> mapTwo = new HashMap<>(30);

        HashMap<String , Integer> mapThree = new HashMap<>(30, 0.3f);

        HashMap<Integer, Integer> mapFour = new HashMap<>();

        HashMap<String, Integer> mapFive = new HashMap<>(mapOne);
    }
}
