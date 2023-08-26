package com.placementCvent;

import java.util.HashMap;
import java.util.Map;

public class checkTwoStringAnagram {
    public static void main(String[] args) {
        String str="silent";
        String str2="lentis";
        System.out.println(checkAna(str, str2));
    }
    public static boolean checkAna(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i))) {
                return false; // Character not found in s1
            }
            map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
            if(map.get(s2.charAt(i)) == 0){
                map.remove(s2.charAt(i));
            }
        }

        return map.isEmpty();
    }
}
