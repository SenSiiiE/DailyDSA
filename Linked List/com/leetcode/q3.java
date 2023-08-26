package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class q3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));

    }
    public static int lengthOfLongestSubstring(String s){
        int left = 0;
        int right = 0;
        int n = s.length();
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(right = 0; right < n; right++){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                ans = Math.max(ans, right - left);
                while(set.contains(s.charAt(left))) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
        }
        return ans;
    }
    public static int lengthOfLongestSubstring1(String s) {
        int i = 0;
        int ans = 0;
        int mx = ans;
        HashMap<Character, Integer> map = new HashMap<>();
        while(i < s.length()){
            if(map.containsKey(s.charAt(i))){
                ans = map.size();
                mx = Math.max(ans, mx);
                map.clear();
            }else{
                map.put(s.charAt(i), 1);
            }
            i++;
        }
        return mx;
    }
}
