package com.placementCvent;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class duplicateChar {
    public static void main(String[] args) {
        //How to Print duplicate characters from String?
        String str = "My name is Vikash. I am a student.";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '.') {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Character : " + entry.getKey() + ", with count : " + entry.getValue());
            }
        }
        duplicate();
    }

    public static void duplicate(){
        String str="java is a programming language";
        char ch[]=str.toCharArray();

        HashSet<Character> map = new HashSet<Character>();
        HashSet<Character> map2 = new HashSet<Character>();
        for(int i=0; i < ch.length; i++){
            if(!map.contains(ch[i]))
                map.add(ch[i]);
            else{
                map2.add(ch[i]);
            }

        }

        for(Character c:map2){
            System.out.println(c);
        }
    }
}
