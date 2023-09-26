package com.codingRound;

import java.util.LinkedHashMap;
import java.util.Map;

public class printOccurence {
    public static void main(String[] args) {
        System.out.println(occurrence("aabbccccdee"));
    }
    static String occurrence(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                sb.append(entry.getKey());
                sb.append(entry.getValue());
            }else{
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
