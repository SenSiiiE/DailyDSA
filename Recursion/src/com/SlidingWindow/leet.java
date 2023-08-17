package com.SlidingWindow;

import java.util.Arrays;

public class leet {
    public static void main(String[] args) {
//        System.out.println(isAnagram("anagram", "naagram"));
        System.out.println('b' - 'a');
    }
    public static boolean isAnagram(String s, String t) {
        int mainLength=s.length();
        int checkLength=t.length();

        if(mainLength!=checkLength){
            return false;
        }

        int[] array=new int[26];
        Arrays.fill(array,0);

        for(int i=0;i<mainLength;i++){
            array[s.charAt(i)-'a']++;
            array[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(array[i]!=0){
                return false;
            }
        }

        return true;
    }
}
