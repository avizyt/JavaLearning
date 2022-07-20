package com.avijit.HashMapFunction;


import java.util.HashMap;
import java.util.Map;

public class NoDuplicateKey {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "python");
        map.put(2, "java");
        map.put(3, "cpp");
        map.put(4, "javascript");
        map.put(5, "Elixir");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m :
                map.entrySet()) {
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        System.out.println("***********Add new value*************");

        map.putIfAbsent(6, "Go");
        for (Map.Entry m :
                map.entrySet()) {
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        System.out.println("***********Add new value*************");
        HashMap<Integer, String > newMap = new HashMap<>();
        newMap.putAll(map);
        for (Map.Entry m :
                map.entrySet()) {
            System.out.println(m.getKey()+" : "+ m.getValue());
        }
    }
}
