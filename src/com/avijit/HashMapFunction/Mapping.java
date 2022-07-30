package com.avijit.HashMapFunction;

import java.util.HashMap;

public class Mapping {
    public static void main(String[] args) {
        HashMap<Integer, Double> map = new HashMap<>();

        int[] id = {2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 2,2,2};
        double[] tripDist = {5.36, 1.6, 3.8, 4.98, 0.77, 1.96, 0.2, 0.51, 6.88, 1.76, 0.0, 0.0, 0.36, 7.24, 5.23};

        System.out.println(id.length);
        System.out.println(tripDist.length);

        map.put(1, 0.0);
        map.put(2, 0.0);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(2));

        for (int i = 0; i < id.length; i++) {
            if (map.containsKey(id[i])){
            map.put(id[i], map.get(id[i]) + tripDist[i]);
        }
        }
        System.out.println(map.get(1));
        System.out.println(map.get(2));

    }
}
