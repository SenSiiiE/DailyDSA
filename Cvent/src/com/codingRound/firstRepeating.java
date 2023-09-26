package com.codingRound;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstRepeating {
    public static void main(String[] args) {
        System.out.println(first(new int[]{10, 5, 3, 4, 3, 5, 6}));
    }
    static int first(int[] a){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i: a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1) return entry.getKey();
        }
        return -1;
    }
}
