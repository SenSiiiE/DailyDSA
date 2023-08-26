package com.placementCvent;

public class replaceChar {
//    How to replace each given character to other e.g. blank with %20?
    public static void main(String[] args) {
        String s="i am ayesha";
        char rem=' ';
        char rep='$';
        System.out.println(replace(s, rem, rep));
    }

    public static String replace(String s, char rem, char rep){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == rem){
                sb.append(rep);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
