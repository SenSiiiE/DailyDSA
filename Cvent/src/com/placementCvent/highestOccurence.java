package com.placementCvent;

import java.util.HashMap;
import java.util.Map;

public class highestOccurence {
//      How to return the highest occurred character in a String?
        public static void main(String[] args) {
            System.out.println(occurrence("banana"));
        }
        public static Integer occurrence(String s){
            Map<Character, Integer> map = new HashMap<>();
            int mx = 0;
            char ans = ' ';
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if(map.get(ch) > mx){
                    ans = ch;
                    mx = map.get(ch);
                }
//                mx = Math.max(map.get(ch), mx);

            }
            System.out.println(ans);
            return mx;
        }
}
