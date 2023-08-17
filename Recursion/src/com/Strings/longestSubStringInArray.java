package com.Strings;

import java.util.Arrays;

public class longestSubStringInArray {
    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    String s = "2";
    String v = "5";
        System.out.println(s+v);

        int num1 = Integer.parseInt(s);
        int num2 = Integer.parseInt(v);
        System.out.println(num2 + num1);

    }
        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String s1 = strs[0];
            String s2 = strs[strs.length-1];
            int idx = 0;
            while(idx < s1.length() && idx < s2.length()){
                if(s1.charAt(idx) == s2.charAt(idx)){
                    idx++;
                } else {
                    break;
                }
            }
            return s1.substring(0, idx);
        }

}
