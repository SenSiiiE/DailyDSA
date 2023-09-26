package com.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MapAna {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "foxfoxfx";
        String ana = "fox";
        int k = ana.length();

        for (char ch: ana.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int count = map.size();
        int ans = 0;
        int i = 0;
        int j = 0;

        while(j < str.length()){
            if(map.containsKey(str.charAt(j))){
                map.put(str.charAt(j), map.get(str.charAt(j))-1);
                if(map.get(str.charAt(j)) == 0){
                    count--;
                }
            }

            if(j-i+1 < k){
                j++;
            } else if (j-i+1 == k) {
                if (count == 0) {
                    ans++;
                }
                if (map.containsKey(str.charAt(i))) {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                    if(map.get(str.charAt(i)) == 1){
                        count++;
                    }
                }

                j++;
                i++;
            }
        }
        System.out.println(ans);

    }
}



