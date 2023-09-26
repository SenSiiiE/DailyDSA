package com.codingRound;

import java.util.HashMap;
import java.util.Map;

public class findDupInArray {
    public static void main(String[] args) {
        System.out.println(duplicate(new int[]{1,2,3,3,4,5}));
    }
    static int duplicate(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() == 2){
                return m.getKey();
            }
        };
        return -1;
    }
}
