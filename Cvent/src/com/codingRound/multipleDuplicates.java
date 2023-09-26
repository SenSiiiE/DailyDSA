package com.codingRound;

import java.util.HashMap;
import java.util.Map;

public class multipleDuplicates {
    public static void main(String[] args) {
        dupPrint(new int[]{1,2,2,3,3,4,4,4,5,6,7});
    }
    static void dupPrint(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : a) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() > 1){
                System.out.println(m.getKey()+": "+m.getValue());
            }
        }
    }
}
