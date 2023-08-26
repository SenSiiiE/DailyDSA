package com.placementCvent;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class removeDupChar {
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(remove2(str));
    }

    public static String remove(String s){
        StringBuilder sb = new StringBuilder("");
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                sb.append(ch);
                map.remove(ch);
            }
        }
        return sb.toString();
    }
    public static String remove2(String s){
        String str="bananas";
        char arr[]=str.toCharArray();
        LinkedHashSet<Character> myset=new LinkedHashSet<Character>();
        for(int i=0;i<arr.length;i++){
            myset.add(arr[i]);
        }


        str=String.valueOf(myset);
//        System.out.println(str);
        return str;
    }
}
