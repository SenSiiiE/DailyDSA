package com.placementCvent;

public class StringToInt {
    public static void main(String[] args) {
        System.out.println(convert("45"));
    }

    public static int convert(String s){
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                ans = ans * 10 + (s.charAt(i) - '0');
            }
        }
        return ans;
    }
}
