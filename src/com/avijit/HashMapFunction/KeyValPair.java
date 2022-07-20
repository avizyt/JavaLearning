package com.avijit.HashMapFunction;

import java.util.HashMap;

public class KeyValPair {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);

        // normal print
        System.out.println(map);

        System.out.println("************************************");
        // print with set
        for (String key :
                map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("************************************");

        // print compact
        map.entrySet().forEach(System.out::println);
    }
}
