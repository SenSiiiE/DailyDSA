package com_placement;

public class reverseStr {
    public static void main(String[] args) {
        String str = "Vikash Sharma";
        String ans = reverse(str);
        System.out.println(ans);
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}